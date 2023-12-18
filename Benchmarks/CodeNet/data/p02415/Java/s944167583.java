import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();

        letterCase(s);
    }

    public static void letterCase(String c) {
        String s = "";
        String[] list = c.split(", ");

        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list[j].length(); i++) {
                String tempCh = list[j].charAt(i) + "";
                if (tempCh.equals(tempCh.toUpperCase())) {
                    s += tempCh.toLowerCase();
                } else {
                    s += tempCh.toUpperCase();
                }
            }

            if (j != list.length-1) {
                s += ", ";
            }
        }
        System.out.println(s);
    }

}

