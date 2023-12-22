import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
 
    if(ss[0]+0>90){
    	System.out.println("a");
    }else{
    	System.out.println("A");
      }
}
}