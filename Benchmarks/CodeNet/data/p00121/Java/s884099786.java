import java.util.*;
public class Main {

	class C {
		int deep;
		String data;
		public C(int deep, String data) {
			this.deep = deep;
			this.data = data;
		}

	}

	private boolean isRange(int x, int y){
		if(x < 0 || x >= 4 || y < 0 || y >= 2){
			return false;
		}
		else{
			return true;
		}
	}

	private String getStr(int [][] array){
		StringBuilder str = new StringBuilder();
		for(int i=0; i < 2; i++){
			for(int j=0; j < 4; j++){
				str.append(""+array[i][j]);
			}
		}
		return str.toString();
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] xdir = {0,1,0,-1};
		int [] ydir = {1,0,-1,0};
		while(sc.hasNext()){
			LinkedList<C> open = new LinkedList<C>();
			TreeSet<String> close =  new TreeSet<String>();

			int [][] input = new int[2][4];
			for(int i=0; i < 2; i++){
				for(int j=0; j < 4; j++){
					input[i][j] = sc.nextInt();
				}
			}
			open.addFirst(new C(0,getStr(input)));
			close.add(getStr(input));

			boolean flg = false;
			while(! open.isEmpty()){
				C pat = open.getFirst();

				open.removeFirst();
				String patStr = pat.data;

				if(patStr.equals("01234567")){
					flg = true;
					System.out.println(pat.deep);
					break;
				}

				int indI = -1;
				int indJ = -1;
				int [][] patData = new int[2][4];
				for(int i=0; i < 2; i++){
					for(int j=0; j < 4; j++){
						patData[i][j] = Integer.parseInt(""+patStr.charAt((i*4) + j));
						if(patData[i][j] == 0){
							indI = i;
							indJ = j;
						}
					}
				}
				for(int i=0; i < 4; i++){
					int newX = indJ + xdir[i];
					int newY = indI + ydir[i];
					if(isRange(newX, newY)){
						int temp = patData[indI][indJ];
						patData[indI][indJ] = patData[newY][newX];
						patData[newY][newX] = (char) temp;
						String newStr = getStr(patData);
						if(! close.contains(newStr)){
							open.addLast(new C(pat.deep+1,newStr));
							close.add(newStr);
						}
						temp = patData[newY][newX];
						patData[newY][newX] = patData[indI][indJ];
						patData[indI][indJ] = temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}