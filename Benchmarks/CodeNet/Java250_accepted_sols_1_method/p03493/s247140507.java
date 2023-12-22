import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStr = sc.next().split("");
        int result = 0;
        if("1".equals(inputStr[0])){
            result++;
        }
        if("1".equals(inputStr[1])){
            result++;
        }
        if("1".equals(inputStr[2])){
            result++;
        }

        System.out.println(result);
    }
}
