import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		String S = sc.next();

        int N = S.length();
        int Aend = (N-1)/2;
        int Bstart = (N+3)/2;
	
        if(S.substring(0,(N-1)/2). equals (S.substring((N+3)/2-1,N))){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
	}
}