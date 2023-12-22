import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.next();

        if(k >= s.length()){
            System.out.println(s);
        }
        else{
            System.out.println(s.substring(0, k) + "...");
        }
    }
}