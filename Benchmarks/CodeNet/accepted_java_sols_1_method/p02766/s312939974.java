import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int k = sc.nextInt();
        int s = 1 , cou = 0;
        long q = 1;
        while(s == 1){
            q = q * k;
            cou++;
            if(n < q){
                s = cou;
                s = 0;
            }
        }
        System.out.println(cou);
        sc.close();
    }
}