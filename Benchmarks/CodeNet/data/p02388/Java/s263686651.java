import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.printf("Input number");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int answer = y*y*y;
        System.out.println(answer);
    }
}
