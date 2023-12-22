import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();
            int[] sco = new int[n];
            int max = 0, min = 1000, sum = 0;
    
            if(n == 0) break;

            for(int i = 0; i < n; i++){
                sco[i] = sc.nextInt();
                sum += sco[i];

                if(min > sco[i]) min = sco[i];
                if(max < sco[i]) max = sco[i];
            }

            System.out.println((sum - min - max)/(n-2));
            
        
        }
    }
}
