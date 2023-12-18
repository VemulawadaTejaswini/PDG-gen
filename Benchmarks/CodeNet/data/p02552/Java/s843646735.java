import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0)
            System.out.println(1);
        if(num==1)
            System.out.println(0);
        sc.close();
    }
}