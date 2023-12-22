import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = 0;

        for(char each : a.toCharArray()){
            sum += each - '0';
        }
        String res = sum % 9 == 0 ? "Yes" : "No";
        System.out.println(res);
    }
}