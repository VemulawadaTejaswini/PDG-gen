import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = a/100;
        int c = a%100;
        if(b*5>=c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
