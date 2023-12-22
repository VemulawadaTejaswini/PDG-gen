import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++){
			if(a[i]*a[i] == (b[i]*b[i] + c[i]*c[i]) || b[i]*b[i] == (a[i]*a[i] + c[i]*c[i]) || c[i]*c[i] == (b[i]*b[i] + a[i]*a[i])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}