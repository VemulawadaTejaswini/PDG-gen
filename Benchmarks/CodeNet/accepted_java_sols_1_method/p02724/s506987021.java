import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        System.out.println(1000*(X/500)+((X%500)/5)*5);
    }
}