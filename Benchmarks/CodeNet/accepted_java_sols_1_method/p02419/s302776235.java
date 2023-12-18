import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String W = sc.next();

        int count = 0;

        String Ti = sc.next();

        while(! Ti.equals("END_OF_TEXT")){
            if(W.equals(Ti.toLowerCase())){
                count++;
            }

        Ti = sc.next();
        }

        System.out.println(count);

        sc.close();
    }
}
