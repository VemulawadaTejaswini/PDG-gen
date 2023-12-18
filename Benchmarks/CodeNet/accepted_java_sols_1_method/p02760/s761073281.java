import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<Integer,Integer> bingo = new HashMap<>();
		for(int i=0;i<9;i++) {
			bingo.put(sc.nextInt(),i);
		}
		int N=sc.nextInt();
		boolean f[]=new boolean[9],an=false;
		Arrays.fill(f, false);
		for(int i=0;i<N;i++) {
			int t=sc.nextInt();
			if(bingo.containsKey(t)) {
				f[bingo.get(t)]=true;
				bingo.remove(t);
			}
		}
		for(int i=0;i<3;i++) {
			boolean t=true;
			for(int j=0;j<3;j++) {
				if(!f[i*3+j]) {
					t=false;
					break;
				}
			}
			if(t) {
				an=true;
				break;
			}
		}
		if(!an) {
			for (int i=0;i<3;i++) {
				boolean t=true;
				for (int j=0;j<3;j++) {
					if (!f[i+j*3]) {
						t=false;
						break;
					}
				}
				if(t){
					an=true;
					break;
				}
			}
		}
		if(!an) {
			boolean t=(f[0]&&f[8]&&f[4])||(f[2]&&f[4]&&f[6]);
			if(t) an=true;
		}
		System.out.println(an?"Yes":"No");
	}
}