import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        int digits=1;
        int next=N/K;

        while(next != 0){
            next = next/K;
            digits = digits + 1;
        }
        System.out.println(digits);   

        
    }
}
