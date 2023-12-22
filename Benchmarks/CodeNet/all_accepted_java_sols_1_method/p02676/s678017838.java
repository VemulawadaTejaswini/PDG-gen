import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
      	String s = sc.next();
     	int howlong = s.length();	

      if(K < howlong){
      	s = s.substring(0,K) + "..." ;
      }        
		System.out.println(s);
	}
 
}