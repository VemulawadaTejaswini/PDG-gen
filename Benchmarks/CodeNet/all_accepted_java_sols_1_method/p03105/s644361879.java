import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();
 
        int res;
 
        res = (b / a) > c ? c : (int)(b / a);
 
        System.out.println(res);
    }
}