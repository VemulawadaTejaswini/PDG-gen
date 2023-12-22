import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double v = sc.nextDouble();
            int ans=0;
            for(int N=0;;N++){
                if(v*v<2.0*9.8*(5*N-5)){
                    ans=N;
                    break;
                }
            }
            System.out.println(ans);
        }
        
    }
}