import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long D = sc.nextLong();
        long K = sc.nextLong();
        int ans = 0;
        long cnt = 0;
        
        if(X < 0){
            X = X * (-1);
        }
        
        long minP = X;
        long minM = X;
        long Xmin = X;
    
        while(Xmin > 0){
            Xmin = Xmin - K;
            minP = minM;
            minM = Xmin;
            cnt++;
            //System.out.println(cnt + " " + minP + " " + minM);
        }
        
        minM = minM * (-1);
        
        //System.out.println(cnt + " " + minP + " " + minM);
        
        if(cnt < D){
            System.out.println(Math.min(minP, minM));
        }else{
            for(int i = 0; i < D; i++){
                X = X - K;
            }
            System.out.print(Math.abs(X));
        }
    }    
}
