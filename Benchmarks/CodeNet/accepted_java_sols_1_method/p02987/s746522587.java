import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String S=sc.next();
	String[] S2=S.split("");
	if(S2[0].equals(S2[1])&&!S2[0].equals(S2[2])&&S2[2].equals(S2[3])) {
		System.out.println("Yes");
	}else if(S2[0].equals(S2[2])&&!S2[0].equals(S2[1])&&S2[1].equals(S2[3])) {
		System.out.println("Yes");
	}else if(S2[0].equals(S2[3])&&!S2[0].equals(S2[2])&&S2[2].equals(S2[1])) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
}
}