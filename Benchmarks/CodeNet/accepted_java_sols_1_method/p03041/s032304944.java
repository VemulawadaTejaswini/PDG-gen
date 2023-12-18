import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	String S = sc.next();
	for(int i=0;i<N;i++){
	    if(i!=K-1){
		System.out.print(S.charAt(i));
	    }else{
		char sk = S.charAt(i);
		if(sk=='A') System.out.print('a');
		else if(sk=='B') System.out.print('b');
		else System.out.print('c');
	    }
	}
    }
}
