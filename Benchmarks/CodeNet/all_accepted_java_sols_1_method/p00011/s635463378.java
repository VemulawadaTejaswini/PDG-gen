import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int n = sc.nextInt();
		int[] p= new int[W];
		for(int i=0;i<W;i++){
			p[i]=i+1;
		}
		for(int i=0;i<n;i++){
			String str=sc.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0])-1;
			int b = Integer.parseInt(ab[1])-1;
			int c;
			c=p[a];
			p[a]=p[b];
			p[b]=c;
		}
		for(int i=0;i<W;i++){
			System.out.println(p[i]);
		}
	}
}