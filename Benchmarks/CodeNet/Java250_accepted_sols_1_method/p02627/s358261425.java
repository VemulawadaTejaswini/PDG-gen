import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int alpha = sc.next().charAt(0);
        if ((int) 'a' <= alpha && alpha <= (int) 'z') System.out.println("a");
        if ((int) 'A' <= alpha && alpha <= (int) 'Z') System.out.println("A");
    } 
}