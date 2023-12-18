import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    
    char[]a = A.toCharArray();
    char[]b = B.toCharArray();
    char[]c = C.toCharArray();
    
    int AA = A.length();
    int BB = B.length();
    
    if(a[AA-1]==b[0] && b[BB-1]==c[0]){
    System.out.println("YES");
    }else{
    System.out.println("NO");    
    }
}
    }
