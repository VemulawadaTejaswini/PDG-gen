import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        for(int i=0; i<3; i++) {
            data[i] = scanner.nextInt();
        }

        if(data[2] >= data[0]) {
            if(data[2] <= data[1]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
