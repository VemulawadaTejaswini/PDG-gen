import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj106().doIt();
	}
	class aoj106{
		void doIt() {
			int g[] = {2,3,5,10,12,15};
			int m[] = {380,550,850,1520,1870,2244};
			int ans[] = new int [65]; 
			for(int i = 1;i < 65;i++)ans[i] = 100000;
			for(int i = 0;i < 50;i++){
				for(int j = 0;j < 6;j++){
					ans[i+g[j]] = Math.min(ans[i+g[j]], ans[i]+m[j]);
				}
			}
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				System.out.println(ans[n/100]);
			}
		}
	}
}