import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int count = 0;
        String strMoney;
        StringBuilder result = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if(line.equals("0")) {
                break;
            } else if(i > 0 && i % 2 == 0) {
                result.append("\n");
            }

            if(i % 2 ==0) {
                count = Integer.valueOf(line);
            } else {
                strMoney = line;
                result.append(calculate(count, strMoney));
            }
            i++;
        }

        System.out.println(result.toString());

    }

    public static int calculate(int count, String strMoney) {
        String[] arrMoney = strMoney.split(" ");
        int total = 0;
        for (String money : arrMoney) {
            total += Integer.valueOf(money);
        }

        int result = 0;
        for (String money : arrMoney) {
            if(Integer.valueOf(money) * count <= total) {
                result++;
            }
        }
        return result;
    }
}
