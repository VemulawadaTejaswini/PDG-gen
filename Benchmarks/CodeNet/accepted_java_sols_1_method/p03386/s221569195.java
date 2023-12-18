import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        boolean bool = true;
        for(int i=0;i<k;i++){
            if(a+i<=b){
                System.out.println(a+i);
            }
            else{
                bool = false;
            }
        }
        for(int i=0;i<k;i++){
            if(b-k+1+i>=a&&bool&&a+k-1<b-k+1+i){
                System.out.println(b-k+1+i);
            }
        }
    }
}