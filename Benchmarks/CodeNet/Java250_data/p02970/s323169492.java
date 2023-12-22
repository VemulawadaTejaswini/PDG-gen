import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    
    int m = D*2+1;
    int ans = N/m;

    if(N%m==0){
        System.out.println(ans);
    }else{
        System.out.println(ans+1);
 }
}
}