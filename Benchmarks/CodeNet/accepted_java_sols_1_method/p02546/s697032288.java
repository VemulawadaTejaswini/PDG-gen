import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.endsWith("s")){
            System.out.println(s + "es");
        }
        else{
            System.out.println(s + "s");
        }
    }
}
