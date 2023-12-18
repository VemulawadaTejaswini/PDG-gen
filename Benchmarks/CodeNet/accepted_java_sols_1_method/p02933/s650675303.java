import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt();
        String match_msg = sc.next();

        if(3200 <= input_num){
            System.out.println(match_msg);
        }else{
            System.out.println("red");
        }
    }
}
