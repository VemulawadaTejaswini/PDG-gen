import java.util.Scanner;
import java.util.ArrayList;

public class Main
  {
    public static void main(String[] args)
    {
        String[] lines = getStdin();

        String[] inputs = lines[0].split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        System.out.println(x*y);
    }

    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }

}
