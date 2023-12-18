import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = (int)Math.ceil(N/1.08);
        int b = (int)Math.floor(N/1.08);

        if(Math.floor(a * 1.08) == N){
            System.out.println(a);
            return;
        }else if(Math.floor(b * 1.08) == N){
            System.out.println(b);
            return;
        }else{
            System.out.println(":(");
        }
    }
}