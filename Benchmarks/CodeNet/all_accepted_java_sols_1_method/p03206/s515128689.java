import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = "Christmas";
        switch (reader.nextInt()) {
            case 22:
                s += " Eve";
            case 23:
                s += " Eve";
            case 24:
                s += " Eve";
        }
        System.out.println(s);
        reader.close();
    }
}