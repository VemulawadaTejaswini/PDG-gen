import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer K = scan.nextInt();
        Integer X = scan.nextInt();


        for(int i=X-K+1;i<=(X+K)-1;i++){
            System.out.print(i + " ");
        }
    }
}
