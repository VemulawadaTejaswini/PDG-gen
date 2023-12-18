import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]){
        int debt = 100000;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            debt += debt*0.05;
            if(debt % 1000 > 0){
                debt -= debt % 1000;
                debt += 1000;
            }
        }
        System.out.println(debt);
    }
}