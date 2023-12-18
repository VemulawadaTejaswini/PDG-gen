import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            int one = input.nextInt();
            int two = input.nextInt();
            if(one == 0 && two == 0)break;
            if (one > two) {
                int temp = one;
                one = two;
                two = temp;

            }
            System.out.println(one + " " + two);
        }

    }}
