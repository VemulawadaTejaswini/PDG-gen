import java.util.Scanner;

class Main{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			int height;

			int[] h = new int[m];
			int[] p = new int[m];
			int[] q = new int[m];

			if(n==0&&m==0&&a==0) break;

			for(int i=0;i<m;i++){
				h[i] = sc.nextInt();
				p[i] = sc.nextInt();
				q[i] = sc.nextInt();
			}
			height = n-1;
			while(true){
				for(int i=0;i<m;i++){
					if(height==h[i]&&a==p[i]) a = q[i];

					else if(height==h[i]&&a==q[i]) a = p[i];
				}
				height--;
				if(height==0) break;
			}
			System.out.println(a);
		}
	}
}