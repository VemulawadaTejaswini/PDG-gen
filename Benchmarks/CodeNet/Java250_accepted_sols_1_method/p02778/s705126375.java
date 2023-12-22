import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
	int num = S.length();
	char[] ss = S.toCharArray();
 		for(int i=0; i<num; i++){
		ss[i] = 'x';
        }   
	System.out.println(String.valueOf(ss));
    }
}