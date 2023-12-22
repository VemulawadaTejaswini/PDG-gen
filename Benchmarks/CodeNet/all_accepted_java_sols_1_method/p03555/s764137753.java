import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    char[]a = A.toCharArray();
    char[]b = B.toCharArray();
    
    if(a[0]==b[2] && a[1]==b[1] && a[2]==b[0]){
    System.out.println("YES");
    }else{
    System.out.println("NO");    
    }
}
}