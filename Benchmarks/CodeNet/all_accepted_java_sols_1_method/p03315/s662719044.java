import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = 0;
        int plus = 0;
        int minus = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='+'){
                plus++;
            }
        }
        minus = s.length()-plus;
        System.out.println(num+plus-minus);
    }
}