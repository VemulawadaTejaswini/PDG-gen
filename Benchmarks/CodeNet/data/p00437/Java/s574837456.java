import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int p1 = stdIn.nextInt();
			int p2 = stdIn.nextInt();
			int p3 = stdIn.nextInt();
			if(p1==0&&p2==0&&p3==0){
				return;
			}
			int p = p1+p2+p3;
			boolean[] ok = new boolean[p+1];
			boolean[] ng = new boolean[p+1];
			int n = stdIn.nextInt();
			int[][] logg = new int[n][4];
			for(int i=0;i<n;i++){
				logg[i] = new int[4];
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				int c = stdIn.nextInt();
				int judge = stdIn.nextInt();
				logg[i][0] = a;
				logg[i][1] = b;
				logg[i][2] = c;
				logg[i][3] = judge;
				if(judge==1){
					ok[a] = true;
					ok[b] = true;
					ok[c] = true;
				}
			}
			for(int i=0;i<n;i++){
				if(logg[i][3]==0){
					int a = logg[i][0];
					int b = logg[i][1];
					int c = logg[i][2];
					if(ok[a]&&ok[b]){
						ng[c] = true;
					}
					else if(ok[a]&&ok[c]){
						ng[b] = true;
					}
					else if(ok[b]&&ok[c]){
						ng[a] = true;
					}
				}
			}
			for(int i=1;i<=p;i++){
				//			System.out.println(ok[i]+"\t"+ng[i]);
				if(ok[i]){
					System.out.println(1);
				}
				else if(!ng[i]){
					System.out.println(2);
				}
				else{
					System.out.println(0);
				}
			}
		}
	}
}