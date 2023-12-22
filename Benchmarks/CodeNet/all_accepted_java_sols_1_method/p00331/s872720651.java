import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),r=sc.nextInt();
        if(h+r==0) {
            System.out.println(0);
        }else if(h+r<0) {
            System.out.println(-1);
        }else {
            System.out.println(1);
        }
     
    }
}
