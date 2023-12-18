import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        sc.close();

        String str = "No";
        if(N%9==0){
            str = "Yes";
        }
        System.out.println(str);
    }
}
