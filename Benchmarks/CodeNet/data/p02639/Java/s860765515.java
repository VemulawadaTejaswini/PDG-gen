import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int n=0;
        int []a=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]=tan.nextInt();
            if(a[i]==0)
                n=i+1;
        }
        System.out.println(n);
    }
}
