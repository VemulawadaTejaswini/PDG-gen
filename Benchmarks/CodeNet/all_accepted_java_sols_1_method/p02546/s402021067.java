
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.endsWith("s")){
            System.out.println(a + "es");
        }else{
            System.out.println(a + "s");
        }
    }
}

