import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int b = 0;
        for(int i=0; i<n; i++) {
            b += sc.nextInt();
        }

        System.out.println(b>=h ? "Yes":"No");
    }



}
