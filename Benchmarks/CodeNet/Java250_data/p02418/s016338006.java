import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),p = sc.nextLine();
        s += s;
        System.out.println(s.contains(p) ? "Yes" : "No");
    }

}