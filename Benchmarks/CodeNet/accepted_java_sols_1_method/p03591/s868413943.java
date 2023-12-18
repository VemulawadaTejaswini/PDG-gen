import java.util.Scanner;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        if(st.startsWith("YAKI")) System.out.println("Yes");
        else System.out.println("No");
    }
}