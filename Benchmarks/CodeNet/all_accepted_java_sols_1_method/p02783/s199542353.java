import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j=0, H, A;
        H = scan.nextInt();
        A = scan.nextInt();
        while(H>0)
        {
            H=H-A;
            j++;
        }
        System.out.println(j);

    }
}