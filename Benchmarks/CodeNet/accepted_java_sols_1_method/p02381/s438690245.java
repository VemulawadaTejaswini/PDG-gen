import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		for(;;) {
			int n=sc.nextInt();
			double nn=n*1.0;
			if(n==0)break;
			double [] s=new double [n];
			double sam=0;
			for(int i=0;i<n;i++) {
				s[i]=sc.nextDouble();
				sam+=s[i];
			}
			double heikin=sam/n;
			sam=0;
			for(int j=0;j<n;j++) {
				s[j]=(s[j]-heikin)*(s[j]-heikin);
				sam+=s[j];
			}
			sam=sam/nn;
			double a=Math.sqrt(sam);
			String strs=String.valueOf(a);
			str=str+strs+"\n";
		}
		System.out.println(str);
		sc.close();
		}
	}
