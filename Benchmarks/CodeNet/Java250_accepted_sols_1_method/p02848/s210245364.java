import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i) + n;
        	if(x > 90){
            	x -= 26;
            }
            System.out.print((char)x);
        }
        System.out.println();
    }
}