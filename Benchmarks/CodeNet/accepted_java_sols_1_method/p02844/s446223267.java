import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S=sc.next();
	String[] S2=S.split("");
	int ikanri[]=new int[10];
	int jkanri[]=new int[100];
	long[] hash=new long[1000];
	int karinum=0;
	int ans=0;
	int monban=0;
	for(int i=0;i<N-2;i++) {
		if(ikanri[Integer.parseInt(S2[i])]==1) {
			continue;
		}else {
			ikanri[Integer.parseInt(S2[i])]=1;
		}
		for(int j=i+1;j<N-1;j++) {
			if(jkanri[Integer.parseInt(S2[i])*10+Integer.parseInt(S2[j])]==1) {
				continue;
			}else {
				jkanri[Integer.parseInt(S2[i])*10+Integer.parseInt(S2[j])]=1;
			}
			for(int k=j+1;k<N;k++) {
				karinum=(Integer.parseInt(S2[i])*100+Integer.parseInt(S2[j])*10+Integer.parseInt(S2[k]));
				if(hash[karinum]==1) {
					continue;
				}else {
					ans++;
					hash[karinum]=1;
					monban++;
				}
				if(ans==1000) {
					System.out.println(ans);
					System.exit(0);
				}
				if(monban==10) {
					monban=0;
					break;
				}
			}
			monban=0;
		}
	}
	System.out.println(ans);
}
}