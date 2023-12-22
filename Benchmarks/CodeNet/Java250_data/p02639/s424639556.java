import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for(int loop=0; loop<5; loop++) {
            int x = scanner.nextInt();
            if(x==0) {
                System.out.println( loop+1 );
                break;
            }
        }

    }
}