import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if(input.endsWith("s")){
            System.out.println(input.substring(0, input.length()-1) + "es");
        }else{
            System.out.println(input+"s");
        }

    }

}
