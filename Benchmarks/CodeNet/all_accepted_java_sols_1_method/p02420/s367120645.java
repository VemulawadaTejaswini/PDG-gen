import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!(line.equals("-"))) {
            
            String num = sc.nextLine();
            int n = Integer.parseInt(num);

            for (int i = 0; i < n; i++) {
                int count = Integer.parseInt(sc.nextLine());

                line = line.substring(count) + line.substring(0, count);
            }
            System.out.println(line);
            line = sc.nextLine();
        }
        sc.close();

    }

}