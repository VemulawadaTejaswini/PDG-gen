import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int res = (X/500)*1000;
        X -=  (X/500)*500;
        res += (X/5)*5;
        System.out.println(res);
    }
}