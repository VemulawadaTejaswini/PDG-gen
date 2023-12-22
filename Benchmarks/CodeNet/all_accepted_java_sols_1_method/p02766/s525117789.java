//import java.lang.Math;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for(int i = 0 ; n != 0 ; i++){
            n = n / k;
            count++;
        }
        System.out.print(count);
    }
}