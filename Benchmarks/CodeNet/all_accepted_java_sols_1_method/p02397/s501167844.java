import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int x = s.nextInt();
            int y = s.nextInt();
            if(x == 0 && y == 0) break;
            String result;
            if( x > y ){
                result = y + " " + x;
            } else {
                result = x + " " + y;
            }
            System.out.println(result);
        }
    }

}