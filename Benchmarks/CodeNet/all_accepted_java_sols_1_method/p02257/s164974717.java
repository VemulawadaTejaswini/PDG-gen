import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 0;
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            if(input == 2){
                prime++;
            }else{
                boolean isPrime = true;
                int a = (int)Math.sqrt(input);
                for(int j = 2; j <= a; j++){
                    if(input % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    prime++;
                }
            }
        }
        System.out.println(prime);
    }
}
