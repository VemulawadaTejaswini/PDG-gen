import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n;
        int sum=0;
        while(true){
            if(n-10>=0){
                sum+=n%10;
                n/=10;
            }
            else{
                sum+=n;
                break;
            }
        }
        if(N%sum==0) System.out.println("Yes");
        else System.out.println("No");
    }
}