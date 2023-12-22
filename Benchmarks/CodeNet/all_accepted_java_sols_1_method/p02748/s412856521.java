import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int M =sc.nextInt();
        
        int result=0;
       
       
        
        int costA[] = new int[A];
        int costB[] = new int[B];
        int numberA[] =new int[M];
        int numberB[] =new int[M];
        int numberM[] =new int[M];
        
        
        
        
        int MinA =1000000;
        int MinB =1000000;
        int Coupon=1000000;
        
        for(int i=0;i<A;i++){
            costA[i]=sc.nextInt();
        }
        
        for(int j=0;j<B;j++){
            costB[j]=sc.nextInt();
        }
        
        for(int k=0;k<M;k++){
            numberA[k]=sc.nextInt();
            numberB[k]=sc.nextInt();
            numberM[k]=sc.nextInt();

        }
        
        
        
        for(int i=0;i<A;i++){
            if(costA[i]<MinA){
                MinA=costA[i];
            }
        }
        
        for(int i=0;i<B;i++){
            if(costB[i]<MinB){
                MinB=costB[i];
            }
        }
        
        
        for(int i=0;i<M;i++){
             result=(costA[numberA[i]-1]+costB[numberB[i]-1]-numberM[i]);
            if(Coupon>result){
                Coupon=result;
            }
        }
        
        if(MinA+MinB<Coupon){
            
            System.out.println(MinA+MinB);
        }else{
             System.out.println(Coupon);
        }
        
    }
}
