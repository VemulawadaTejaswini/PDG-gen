import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int T = S.length();
    for(int i=0; i<T; i++){
    	if(i==0) {
    		S="";
    	}
    	S=S+"x";
    }
    System.out.println(S);
  }
}