import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S=sc.next();
	String[] S2=S.split("");
	if(N%2==1) {
		System.out.println("No");
		System.exit(0);
	}
	for(int i=N/2;i<N;i++) {
		if(!S2[i].equals(S2[i-N/2])) {
			System.out.println("No");
			System.exit(0);
		}
	}
	System.out.println("Yes");


}
}