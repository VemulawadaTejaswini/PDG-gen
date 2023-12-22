import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);

        int num1 = Integer.parseInt(scanNumber.next());

        int num2 = Integer.parseInt(scanNumber.next());

        int num3 = Integer.parseInt(scanNumber.next());

        int answer = 0;

        if(num1 < num2){
            if(num2 < num3){
                answer = num3 - num1;
            }
            else{
                if(num1 < num3){
                    answer = num2 - num1;
                }
                else{
                    answer = num2 - num3;
                }
            }
        }
        else if(num1 < num3){
            answer = num3 - num2;
        }
        else{
            if(num2 < num3){
                answer = num1 - num2;
            }
            else{
                answer = num1 - num3;
            }
        }

        System.out.print(answer);

    }
}
