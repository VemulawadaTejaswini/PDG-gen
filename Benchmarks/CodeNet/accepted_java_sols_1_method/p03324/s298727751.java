import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        if(N!=100)
            System.out.println((int)Math.pow(100, D) * N);
        else{
            if(D == 0){
                System.out.println(101);
            }
            if(D == 1){
                System.out.println(10100);
            }
            if(D == 2){
                System.out.println(1010000);
            }
        }
    }

}