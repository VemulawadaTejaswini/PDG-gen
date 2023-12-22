import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StringBuilder result = new StringBuilder();
        result.insert(0, String.valueOf(input.nextInt()));
        for(int i = 1; i < number; i++){
            int temp = input.nextInt();
            result.insert(0, String.valueOf(temp) + " ");
        }
        System.out.println(result);
    }
}

