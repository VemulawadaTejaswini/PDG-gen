import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int k = 1;

        int now = 0;
        for(int i = 1 ; i < n ; i++){
            now = sc.nextInt();
            if(now <= min){
                min = now;
                k++;
            }
        }
        System.out.println(k);
    }
}