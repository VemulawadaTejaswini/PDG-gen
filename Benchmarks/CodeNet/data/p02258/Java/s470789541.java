import java.util.Scanner;
class Fx{
	int a;
	int [] p=new int[200000];
	int ans;
	void rieki() {
		int minv=p[0];
		int maxv=p[1]-p[0];
		for(int j=1;j<a;j++) {
			maxv=Math.max(maxv, p[j]-minv);
			minv=Math.min(minv,p[j]);
		}
		ans=maxv;
	}
}
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] s=new int [n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}
		Fx f=new Fx();
		f.a=n;
		for(int i=0;i<n;i++) {
			f.p[i]=s[i];

		}
		f.rieki();
		System.out.println(f.ans);
		sc.close();
	}
}

