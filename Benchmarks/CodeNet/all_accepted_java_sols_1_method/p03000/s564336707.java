import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int x = Integer.parseInt(params[1]);
        params = in.nextLine().split(" ");
        int[] ls = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            ls[i] = Integer.parseInt( params[i]);
        }

        int count = 1;
        int totalD = 0;
        for( int i = 0 ; i < n && totalD <= x ; i++ ){
            if( ls[i] + totalD <= x ){
                totalD += ls[i];
                count++;
            }
            else {
                break;
            }
        }

        System.out.println(count);

    }
}