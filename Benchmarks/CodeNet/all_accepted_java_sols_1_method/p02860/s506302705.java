import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[]ss = S.toCharArray();
    
    if(N%2!=0){
    System.out.println("No");
    }else if(S.substring(0,N/2).equals (S.substring(N/2,N))){
    System.out.println("Yes");
    }else{
    System.out.println("No");   
        }
    }
}