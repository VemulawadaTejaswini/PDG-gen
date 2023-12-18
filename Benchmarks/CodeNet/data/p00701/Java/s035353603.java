import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<Stack<Integer>> pile = new ArrayList<Stack<Integer>>();
			for(int i = 0; i < n; i++){
				pile.add(new Stack<Integer>());
				pile.get(i).add(i + 1);
			}
			while(true){
				int from = sc.nextInt();
				int to = sc.nextInt();
				if((from|to)==0)break;
				int [] fromind = find(from, pile);
				int [] toind = find(to, pile);
				if(to == 0){
					while(true){
						int num = pile.get(fromind[0]).pop();
						if(num == from){
							for(int i = 0; i < pile.size(); i++){
								if(pile.get(i).size() == 0){
									pile.get(i).add(num);
									break;
								}
							}
							break;
						}
						for(int i = 0; i < pile.size(); i++){
							if(pile.get(i).size() == 0){
								pile.get(i).add(num);
								break;
							}
						}
					}
				}
				else if(fromind[0] == toind[0]){
					if(fromind[1] >= toind[1]){
						//ok
					}
					else{
						while(true){
							int num = pile.get(fromind[0]).pop();
							if(num == from){
								for(int i = 0; i < pile.size(); i++){
									if(pile.get(i).contains(to)){
										pile.get(i).add(num);
										break;
									}
								}
								break;
							}
							for(int i = 0; i < pile.size(); i++){
								if(pile.get(i).size() == 0){
									pile.get(i).add(num);
									break;
								}
							}
						}
					}
				}
				else{
					while(true){
						int num = pile.get(fromind[0]).pop();
						if(num == from){
							for(int i = 0; i < pile.size(); i++){
								if(pile.get(i).contains(to)){
									pile.get(i).add(num);
									break;
								}
							}
							break;
						}
						for(int i = 0; i < pile.size(); i++){
							if(pile.get(i).size() == 0){
								pile.get(i).add(num);
								break;
							}
						}
					}
				}
			}
			ArrayList<Integer> pilesize = new ArrayList<Integer>();
			for(int i = 0; i < n; i++){
				if(pile.get(i).size() == 0)continue;
				pilesize.add(pile.get(i).size());
			}
			Collections.sort(pilesize);
			for(int size: pilesize){
				System.out.println(size);
			}
			System.out.println("end");
		}
	}

	private int[] find(int from, ArrayList<Stack<Integer>> pile) {
		for(int i = 0; i < pile.size(); i++){
			for(int j = 0; j < pile.get(i).size(); j++){
				if(pile.get(i).get(j) == from){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}