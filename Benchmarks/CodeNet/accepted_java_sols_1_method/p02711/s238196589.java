import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        if(N % 10 == 7){
            System.out.println("Yes");
        }else{
            N = N/10;
            if(N % 10 == 7){
                System.out.println("Yes");
            }else{
                N = N/10;
                if(N % 10 == 7){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }

    }
}