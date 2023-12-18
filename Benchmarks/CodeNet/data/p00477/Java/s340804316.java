import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
        System.out.println(m/60);
        System.out.println(m%60);
    }
}