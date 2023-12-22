import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            int k,x;
            k=tan.nextInt();
            x=tan.nextInt();
            if(500*k>=x)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
