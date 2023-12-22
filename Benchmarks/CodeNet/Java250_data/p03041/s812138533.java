import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	String S = sc.next();
    	sc.close();
    	String S1,S2,S3;
    	if(K > 1) {
    		S1 = S.substring(0,K-1);
    	}else {
    		S1 = "";
    	}
    	S2 = S.substring(K-1,K);
    	if(K < N) {
    		S3 = S.substring(K,N);
    	}else {
    		S3 = "";
    	}
    	if(S2.equals("A")) {
    		S2 = "a";
    	}else if(S2.equals("B")) {
    		S2 = "b";
    	}else{
    		S2 = "c";
    	}
    	S = S1 + S2 + S3;
    	System.out.println(S);
    }
}