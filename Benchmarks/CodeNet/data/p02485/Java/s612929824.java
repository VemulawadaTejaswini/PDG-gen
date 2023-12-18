import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num_char = scan.next().charAt(0);

        while (num_char != 0){
            int sum = 0;

            while(num_char != '\n'){
                sum += num_char - '0';
                num_char = scan.next().charAt(0);
                System.out.println(num_char);
            }

            System.out.println(sum);
            sum = 0;
            num_char = scan.next().charAt(0);
        }
    }
}