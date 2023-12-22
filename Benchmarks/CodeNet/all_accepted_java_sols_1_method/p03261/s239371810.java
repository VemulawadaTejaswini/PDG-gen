import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        String s[] = new String[n];
        for(int i = 0; i < n; i++){
        	s[i] = sc.next();
            if(i > 0 &&  !(s[i - 1].substring(s[i - 1].length() - 1).equals(s[i].substring(0,1)))){
            	System.out.println("No");
                return;
            }
            for(int j = 0; j < i; j++){
            	if(s[i].equals(s[j])){
                	System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}