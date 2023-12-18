import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int cb,bb=0;
		int n[]=new int[10];
		for(int j=0;j<a;j++){
			boolean s=true;
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