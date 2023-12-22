import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            String s = sc.next();
            if(s.equals("0")) break;
            for(int i = 0; i < s.length(); i++){
                sum += s.charAt(i) - '0';
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}

