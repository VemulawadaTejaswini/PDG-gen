import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if((n|m|a) == 0)break;
			ArrayList<ArrayList<int []>> amida = new ArrayList<ArrayList<int[]>>();
			for(int i = 0; i <= 1000; i++){
				amida.add(new ArrayList<int[]>());
			}
			
			for(int i= 0; i < m;i ++){
				int h = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				amida.get(h).add(new int[]{p,q});
				amida.get(h).add(new int[]{q,p});
			}
			int nowpos = a;
			for(int i = 0; i < m; i++){
				for(int j = 0; j < amida.get(m - i - 1).size();j++){
					if(nowpos == amida.get(m-i-1).get(j)[0]){
						nowpos = amida.get(m-i-1).get(j)[1];
						break;
					}
				}
			}
			System.out.println(nowpos);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}