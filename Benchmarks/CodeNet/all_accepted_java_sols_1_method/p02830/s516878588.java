import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	String T = sc.next();
	char[] s = new char[N];
	char[] t = new char[N];
	for(int i=0;i<N;i++){
	    s[i] = S.charAt(i);
	    t[i] = T.charAt(i);
	}
	for(int i=0;i<N;i++){
	    System.out.print(s[i]);
	    System.out.print(t[i]);
	}
    }
}
