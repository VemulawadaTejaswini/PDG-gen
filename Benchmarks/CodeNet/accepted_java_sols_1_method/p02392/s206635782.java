import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] num = str.split(" ",0);
        int a,b,c;

        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        c = Integer.valueOf(num[2]);

        if(c>b) {
            if (b>a) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}

