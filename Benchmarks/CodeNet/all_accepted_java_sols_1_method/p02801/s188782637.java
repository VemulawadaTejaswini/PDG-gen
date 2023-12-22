import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        char C= sc.next().charAt(0);
        int ascii = (int) C;
        ascii++;
        C= (char) ascii;
        System.out.println(C);
    }
}
