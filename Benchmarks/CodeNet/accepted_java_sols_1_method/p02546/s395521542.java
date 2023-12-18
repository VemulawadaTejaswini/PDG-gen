import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String end;
        if(line.endsWith("s")) {
            end = "es";
        } else {
            end = "s";
        }
        System.out.println(line + end);
    }
}