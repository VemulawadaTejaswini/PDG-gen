import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 		String tmp = ""+N;
     	int howlong = tmp.length();
      	String a = tmp.substring(howlong-1);
      	int n = Integer.parseInt(a);
      	String pon ="pon";
      	
      	if(n==2 || n==4 || n==5 || n==7 || n==9){
          pon = "hon";
        } else if (n==3){
          pon = "bon";
        }
      
		System.out.println(pon);
	}
 
}