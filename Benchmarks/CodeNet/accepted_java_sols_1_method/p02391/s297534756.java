import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        int a = Integer.parseInt(line);
        line = sc.next();
        int b = Integer.parseInt(line);

        if(a < b){
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
        sc.close();
    }


}
