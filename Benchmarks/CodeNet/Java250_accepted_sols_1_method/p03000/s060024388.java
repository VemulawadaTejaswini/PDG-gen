import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            int n = Integer.parseInt(inputs[0]);
            int x = Integer.parseInt(inputs[1]);

            String lineStr = scanner.nextLine();
            String[] lines = lineStr.split(" ");
            int[] line = new int[n];

            for (int i = 0;i < n;i++) {
                 
                line[i] = Integer.parseInt(lines[i]);
            }

            int answer = 1;
            int distance = 0;

            for (int i =0;i< n;i++) {

                distance  = distance + line[i];
                
                if (distance > x) {
                    break;
                } 

                answer++;

            }

            System.out.println(answer);
            
            scanner.close();
    }
}