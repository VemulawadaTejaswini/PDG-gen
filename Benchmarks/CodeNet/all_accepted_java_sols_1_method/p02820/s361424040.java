import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),r=sc.nextInt(),s=sc.nextInt(),p=sc.nextInt();
		char[] t=sc.next().toCharArray(),d=new char[n];
		long score =0;
		sc.close();
		for(int i=0;i<n;i++) {
			if(t[i]=='p') {
				if(i-k<0 || (i-k>=0 && d[i-k]!='s')) {
					score+=s;
					d[i]='s';
				}
			}else if(t[i]=='s') {
				if(i-k<0 || (i-k>=0 && d[i-k]!='r')) {
					score+=r;
					d[i]='r';
				}
			}else {
				if(i-k<0 || (i-k>=0 && d[i-k]!='p')) {
					score+=p;
					d[i]='p';
				}
			}
		}
		System.out.println(score);
	}
}