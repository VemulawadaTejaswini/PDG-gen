import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
    
    ss[3] = '8';
    	 System.out.println(String.valueOf(ss));
    }
}