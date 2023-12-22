import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int i,sum=0;
        for(i=0;i<M;i++){
            int A=scan.nextInt();
            sum=sum+A;
        }
        int result=N-sum;
        if(result>=0){
            System.out.println(result); 
        }
        else{
            System.out.println("-1");
        }
    }
}