import java.util.*;

public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        // int H = sc.nextInt();
        boolean flag = false;
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int A = sc.nextInt();
            if(A%2 == 0){
                if(A%3!=0 && A%5!=0){
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("DENIED");
        }else{
            System.out.println("APPROVED");         
        }

    }
}