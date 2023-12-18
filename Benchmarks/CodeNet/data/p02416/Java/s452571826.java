import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        for (String str = sc.next(); !str.equals("0"); str = sc.next()){
            sum = 0;
            char[] ch = str.toCharArray();
            
            for (int i = 0; i < str.length(); i++){
                sum += ch[i] - '0';
            }
            System.out.println(sum);
        }
    }
}