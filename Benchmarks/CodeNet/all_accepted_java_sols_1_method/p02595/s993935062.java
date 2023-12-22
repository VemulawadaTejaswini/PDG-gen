import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int count = 0;

        for(int i = 1 ; i <= N ; i++){
            double p = sc.nextInt();
            double q = sc.nextInt();

            if(Math.sqrt(p*p+q*q)<=D){
                count++;
            }
        

        }
        sc.close();
        System.out.println(count);
    }
}