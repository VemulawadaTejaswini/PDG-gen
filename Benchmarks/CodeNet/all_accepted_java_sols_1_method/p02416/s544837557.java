import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("0")) break;
            int sum = 0;
            for(int i=0; i<str.length(); i++){
                sum += Integer.valueOf(str.charAt(i)-48);
            }
            System.out.println(sum);
        }
    }
}
