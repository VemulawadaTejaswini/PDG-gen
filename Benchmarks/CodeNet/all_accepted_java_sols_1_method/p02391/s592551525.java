import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String relation = "==";
        if (a<b) {
            relation = "<";
        }else if (a>b) {
            relation = ">";
        }
        System.out.println("a " + relation + " b");
    }
}