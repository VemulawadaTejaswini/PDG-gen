import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean s=true;
		int a=sc.nextInt();
		int b[]=new int[10],cb,bb=0;
		int c[]=new int[10];
		int n[]=new int[10];
		for(int j=0;j<a;j++){
			for(int i=0;i<n.length;i++){
				n[i]=sc.nextInt();
			}
			cb=n[0];
			for(int i=1;i<n.length;i++){
				if(cb<n[i])cb=n[i];
				else if(bb<n[i])bb=n[i];
				else s=false;
			}
			if(s)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}