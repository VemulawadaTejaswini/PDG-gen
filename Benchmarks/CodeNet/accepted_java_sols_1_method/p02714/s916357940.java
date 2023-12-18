import java.util.Scanner;
public class Main {

@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S2=sc.next();
	String S[]=S2.split("");
	long ans=0;
	if(N<=3) {
		System.out.println(0);
	}else {
		long Rnum=0;
		long Gnum=0;
		long Bnum=0;
		for(int i=0;i<N;i++) {
			if(S[i].equals("R")) {
				Rnum++;
			}else if(S[i].equals("G")) {
				Gnum++;
			}else {
				Bnum++;
			}
		}
		ans=Rnum*Gnum*Bnum;
		for(int j=1;j<N-1;j++) {
			for(int i=j-1,k=j+1;i>=0&&k<N;i--,k++) {
				if(!S[j].equals(S[i])&&!S[j].equals(S[k])&&!S[k].equals(S[i])) {
					ans--;
				}
			}
		}
		System.out.println(ans);


	}
	}
}
