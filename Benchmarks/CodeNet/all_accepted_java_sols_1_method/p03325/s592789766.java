import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int res = 0;
        int a;
        for (int i =0; i<n; ++i){
            a = reader.nextInt();
            while(a%2==0){
                res++;
                a/=2;
            }
        }
        System.out.println(res);
        reader.close();
    }
}