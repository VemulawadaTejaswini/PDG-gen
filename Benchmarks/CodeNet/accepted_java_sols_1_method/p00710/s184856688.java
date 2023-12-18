import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0){
                break;
            }
            int[] num = new int[n];
            for(int i = 0; i < n; i++){
                num[i] = i+1;
            }
            for(int i = 0; i < r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] stock = new int[n];
                for(int j = 0; j < n; j++){
                    stock[j] = num[j];
                }
                for(int j = 0; j < c; j++){
                    num[j] = stock[p-1+j];
                }
                for(int j = c; j < p+c-1; j++){
                    num[j] = stock[j-c];
                }
            }
            System.out.println((n+1-num[0]));
        }
    }    
}
