
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        List<String> inputs = new ArrayList<>();
        for(int i = 0; i <= count; i++) {
            String value = scan.nextLine();
            String[] values = value.split(" ");
            if(value.startsWith("2")) {
                inputs.remove(inputs.size()-1);
            } else if(value.startsWith("0")) {
                inputs.add(values[1]);
            } else if(value.startsWith("1")) {
                System.out.println(inputs.get(Integer.parseInt(values[1])));
            }
        }

        scan.close();
    }
}
