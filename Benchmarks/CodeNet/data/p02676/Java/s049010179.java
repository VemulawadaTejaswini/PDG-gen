import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sr = new Scanner(System.in);
      	int K = sr.nextInt();
        String S = sr.next();
      if(K >= S.length())
        System.out.println(S);
      else
        System.out.println(S.substring(0,K) + "...");
      
    }
} 