import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    int e = A*B;
    int f = C*D;
    
    if(e>=f){
    System.out.println(e);
    }else{
    System.out.println(f);    
    }
    }
}
