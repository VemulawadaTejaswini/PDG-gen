import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String x = sc.next();
            if(x.equals("0")){
                break;
            }
            int len = x.length();
            char[] number = new char[len];
            for(int i = 0; i < len; i++){
                number[i] = x.charAt(i);
            }
            int Sum = 0;
            for(int i = 0; i < len; i++){
                Sum = Sum + (number[i] - '0');
            }
            System.out.println(Sum);
        }
    }
}
