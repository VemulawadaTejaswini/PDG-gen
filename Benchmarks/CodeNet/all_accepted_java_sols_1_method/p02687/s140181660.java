import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine())
            sb.append(sc.nextLine());
        if (sb.toString().equals("ARC")) {
            System.out.println("ABC");
            return;
        }
        if (sb.toString().equals("ABC")) {
            System.out.println("ARC");
            return;
        }
    }
}
