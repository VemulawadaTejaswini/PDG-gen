import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i;
        while(true){
            x = sc.nextInt();
            if ( x == 0 ) break;
            if(x > y){
            i = x;
            x = y;
            y = i;
            System.out.println(x + " " + y);
            
        }
}

}

