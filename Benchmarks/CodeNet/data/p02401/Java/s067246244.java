import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EasyCalc{
    public static void main(String[]args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = br.readLine();
            String[] lines = line.split(" ", 0);
            int a = Integer.parseInt(lines[0]);
            char op = lines[1].charAt(0);
            int b = Integer.parseInt(lines[2]);

            if (op == '+') {
                System.out.println(a + b);
            } else if (op == '-') {
                System.out.println(a - b);
            } else if (op == '*') {
                System.out.println(a * b);
            } else if (op == '/') {
                System.out.println(a / b);
            }
        }

        catch (NumberFormatException e){
            return;
        }

        catch (IOException e){
            return;
        }


    }
}
