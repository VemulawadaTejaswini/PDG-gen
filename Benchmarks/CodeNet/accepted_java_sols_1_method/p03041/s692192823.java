import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] c = sc.next().toCharArray();
        c[K-1] += 32;
        for (int i=0;i<N;i++){System.out.print(c[i]);}
    }
}