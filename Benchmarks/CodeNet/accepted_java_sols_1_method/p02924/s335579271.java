import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1 ~ 10^91
        Long N = sc.nextLong();
        System.out.println((N-1)*(N)/2);
        sc.close();
    }
}