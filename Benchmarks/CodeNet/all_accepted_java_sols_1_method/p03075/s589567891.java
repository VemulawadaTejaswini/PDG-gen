import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Integer[] antenna = {Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next())};
        int range = Integer.parseInt(sc.next());

        boolean result = true;
        for (int i = 0; i < antenna.length - 1; i++) {
            for (int j = i + 1; j < antenna.length; j++) {
                if (Math.abs(antenna[i] - antenna[j]) > range) {
                    result = false;
                }
            }
        }

        System.out.println(result ? "Yay!" : ":(");
    }
}