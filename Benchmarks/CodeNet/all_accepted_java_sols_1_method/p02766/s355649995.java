import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int ans=0;

        do{
            if(N/K != 0){
                ans +=1;
                N /= K;
            }
        }while(N/K !=0);

        System.out.println(ans+1);
    }
}
