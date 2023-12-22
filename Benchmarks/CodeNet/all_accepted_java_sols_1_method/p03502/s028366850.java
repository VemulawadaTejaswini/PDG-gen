import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();
    
    int al = 0;
    int all = 0;
    for(int i=0; i<N.length(); i++){
        al += n[i];
        all = al - 48*N.length();
}
    int num = Integer.parseInt(N);

    if(num%all==0){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
    }        
}