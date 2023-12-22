import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String give = sc.next();
        while(!(give.equals("0"))){
            int sum = 0;
            int length = give.length();
            for(int i=0;i<length;i++){
                sum+=give.charAt(i)-'0';
            }
            System.out.println(sum);
            give=sc.next();
        }
        sc.close();
    }
}
