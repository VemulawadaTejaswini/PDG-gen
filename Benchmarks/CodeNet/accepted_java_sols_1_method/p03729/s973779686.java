import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        char data1End = data[0].charAt(data[0].length()-1);
        char data2Head = data[1].charAt(0);
        char data2End = data[1].charAt(data[1].length()-1);
        char data3Head = data[2].charAt(0);

        if(data1End == data2Head) {
            if(data2End == data3Head) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
