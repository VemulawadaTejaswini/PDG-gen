import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b){
            if(c != a)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if(a==c){
            if(b != a)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if(b==c){
            if(a != b)
                System.out.println("Yes");
            else
                System.out.println("No");

        } else{
            System.out.println("No");
        }
    }
}
