import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int line_x = Integer.parseInt(line[0]);
            int line_y = Integer.parseInt(line[1]);

            System.out.println(line_x*line_y +" "+ 2*(line_x+line_y));
        }
    }
}