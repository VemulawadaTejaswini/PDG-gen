import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String[] Rain = S.split("S");
      	
      	int max_r = 0;
      	for(String r : Rain){
        	if(max_r < r.length()){
            	max_r = r.length();
            }
        }
    System.out.println(max_r);
    }
}