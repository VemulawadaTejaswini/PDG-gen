import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int apple=sc.nextInt();
        int apple_piece=sc.nextInt();
        apple_piece+=apple*3;
        System.out.println(apple_piece/2);
    }    
}
