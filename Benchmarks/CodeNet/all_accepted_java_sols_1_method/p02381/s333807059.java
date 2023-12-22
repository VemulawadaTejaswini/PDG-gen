import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int flag = 0;
        while(true){
            

            int N = sc.nextInt();

            if(N == 0) break;
           if(flag == 1) System.out.print("\n");

            int[] sco = new int[N];
            int sum = 0, bun2;
            double bun1=0.0;

            for(int i = 0; i<N; i++){
                sco[i] = sc.nextInt();
                sum += sco[i];
             }

             for(int i=0; i<N; i++){
                bun1 +=  (sco[i] - (double)sum/N) * (sco[i] - (double)sum/N);
               // System.out.println(sco[i] - (double)sum/N);
             }

             System.out.print(Math.sqrt((double)bun1/(double)N));
             flag = 1;
    }

    }
}

                                        
                                    
                    
