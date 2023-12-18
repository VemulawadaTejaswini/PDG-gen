import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t= {6000,4000,3000,2000};
        for(int i=0;i<4;i++) {
            System.out.println(t[sc.nextInt()-1]*sc.nextInt());
        }
    }
}
