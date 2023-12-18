import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String str2 = str.replace("?","D");
        System.out.println(str2);
    }
}
