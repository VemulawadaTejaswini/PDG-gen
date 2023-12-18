import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        int [] primes = new int[100000];
        for(int x = 0; x < primes.length; x++){
            primes[x] = 0;
        }
        for(int x = 2; x < 100000; x++){
            if(primes[x] == 0){
                for(int y = 2; y * x < primes.length;y++){
                    primes[y *x] = 1;
                }
            }
        }
        for(int x = 0; x < n; x++){
            int k = scan.nextInt();
            if(primes[k] == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
