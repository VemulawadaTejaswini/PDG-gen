import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int sum=sc.nextInt()+sc.nextInt();
            System.out.println(String.valueOf(sum).length());
        }
        sc.close();
    }
}
