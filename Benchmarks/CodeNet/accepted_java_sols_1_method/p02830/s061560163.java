import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S=sc.next();
	String T=sc.next();
	String S2[]=S.split("");
	String T2[]=T.split("");
	String ans="";
	for(int i=0;i<N;i++) {
		ans+=S2[i];
		ans+=T2[i];
	}
	System.out.println(ans);
}
}