import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int count = 0;
        while(true){
            String a = sc.next();
            if(a.equals("END_OF_TEXT")) break;
            if(a.equalsIgnoreCase(x)) count++;
        }
        System.out.printf("%d\n",count);
    }
}
