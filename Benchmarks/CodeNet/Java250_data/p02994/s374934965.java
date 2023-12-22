import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = b+(a-1);
        if(c>=0&&b<=0){
            System.out.println(a*(b+c)/2);
        }else if(c<0&&b<0){
            System.out.println(a*(b+c)/2-c);
        }else{
            System.out.println(a*(b+c)/2-b);
        }
    }
}