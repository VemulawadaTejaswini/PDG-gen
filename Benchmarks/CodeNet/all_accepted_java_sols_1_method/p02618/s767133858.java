import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for(int i = 1;i<=d;i++) {
            System.out.println((i*5)%26+1);
        }
    }
}
