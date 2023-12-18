import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj108().doIt();
	}
	class aoj108{
		int C(int a[],int n){
			int result = 0;
			int b[] = new int [n];
			int c[] = new int [n];
			for(int i = 0;i < n;i++){
				b[i] = a[i];
				c[i] = a[i];
			}
			while(true){
				int out = 0;
				for(int i = 0;i < n;i++){
					int cnt = 0;
					for(int j = 0;j < n;j++){
						if(a[i] == b[j])cnt++;
					}
					c[i] = cnt;
				}
				for(int i = 0;i < n;i++){
					if(c[i] == b[i])out++;
					a[i] = c[i];b[i] = c[i];
				}
				if(out == n)break;
				result++;
			}
			return result;
		}
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int a[] = new int [n];
				for(int i = 0;i < n;i++)a[i] = sc.nextInt();
				System.out.println(C(a,n));
				for(int i = 0;i < n-1;i++)System.out.print(a[i]+" ");
				System.out.println(a[n-1]);
			}
		}
	}
}