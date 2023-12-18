import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long sum, input;
        String num;

        while(true){
            sum = 0;
            num = scanner.next();
            input = Integer.parseInt(num);
            
            if(input == 0){
                break;
            }

            while (input > 0){
                sum += input % 10;
                input /= 10;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}

