import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long i = 100;
        int k = 0;
        while(i < x){
            i = i + i / 100;
            k++;
        }
        System.out.println(k);
        sc.close();
    }
}