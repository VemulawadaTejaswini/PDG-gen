import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();
        int N = sc.nextInt();
        int num =0;
        
        if(D==0&&N!=100){
            System.out.println(1*N);
            return;
        }else if(N==100){
            num =(int)(Math.pow(100,D))*(N+1);
            System.out.println(num);
            return;
        }
        else{
            num =(int)(Math.pow(100,D))*N;
        }
        
        System.out.println(num);
    }
    
} 