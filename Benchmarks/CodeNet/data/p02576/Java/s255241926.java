import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int time = 0;
        if(N%X==0){
            time = N/X*T;
        }else{
            time = (N/X)*T*2;
        }
        System.out.println(time);       
    }    
}