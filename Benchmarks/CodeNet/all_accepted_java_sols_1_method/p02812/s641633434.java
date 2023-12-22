import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count = 0;
	String s = sc.next();
	char[] S  = new char[N];
	for(int i=0;i<N;i++) S[i] = s.charAt(i);

	for(int i=0;i<N-2;i++){
	    if(S[i]=='A' && S[i+1]=='B' && S[i+2]=='C')
		count++;
	}
	System.out.print(count);
    }
}
