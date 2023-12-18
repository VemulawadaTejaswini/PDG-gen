import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S=sc.next();
    int K=sc.nextInt();
    int X=S.length();
    if(X<=K) {
    	System.out.println(S);
    }else {
    	String Z=S.substring(0,K);
    	System.out.println(Z+"...");
    }
    	
    }
}