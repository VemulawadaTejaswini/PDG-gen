import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.valueOf(line).intValue();
        line = sc.nextLine();

        int i = 0;
        double db = 0.0;
        while(i != num){
            String[] input = line.split(" ", 0);
            db += 1.0/Double.parseDouble(input[i]);
          i++;
        }
        System.out.println(1.0/db);   
    }
}