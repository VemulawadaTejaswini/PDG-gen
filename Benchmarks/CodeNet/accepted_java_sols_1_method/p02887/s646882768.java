import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S=sc.next();
	String S2[]=S.split("");
	String before=S2[0];
	int ans=1;
	for(int i=1;i<N;i++) {
		if(before.equals(S2[i])) {
			continue;
		}else {
			ans++;
			before=S2[i];
		}
	}
	System.out.println(ans);
}
}