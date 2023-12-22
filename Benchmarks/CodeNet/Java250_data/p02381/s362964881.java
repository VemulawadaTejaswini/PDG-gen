import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] s;
            s = new int[n];
            int Sum = 0;
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
                Sum += s[i];
            } 
            double Average = (double)Sum/n;
            double a = 0.0;
            for(int i = 0; i < n; i++){
                a += (s[i] -Average)*(s[i] -Average);
            }
            a /= n;
            System.out.println(Math.sqrt(a));
        }
    }    
}
