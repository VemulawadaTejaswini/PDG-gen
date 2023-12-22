import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArray = s.split("");
        String result = "";

        for (int i = 0; i < sArray.length; i++) {
            if ("0".equals(sArray[i])) {
                result += "0";
            } else if ("1".equals(sArray[i])) {
                result += "1";
            } else if ("B".equals(sArray[i])) {
                if ("".equals(result)) {
                    continue;
                }
                result = result.substring(0, result.length() - 1);
            }
        }
        System.out.println(result);
    }

}
