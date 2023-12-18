import java.util.*;
class Main{
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int x = scan.nextInt();
            x += scan.nextInt();
            int digit = 0;
            while(x > 0){
                x /= 10;
                digit++;
            }
            System.out.println(digit);
        }
    }
}
