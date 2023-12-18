import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String S = sc.nextLine();
	    int K = sc.nextInt();
	    if(S.length()<=K){
	        System.out.println(S);
	    }else{
	        System.out.println(S.substring(0,K)+"...");
	    }
	}
}
