import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] string = new String[n];

        for (int i = 0; i < n; i++) {
            string[i] = scan.next();
        }

        for(int i = string.length-1; i >= 0; i--){
            if(i != 0){
                System.out.print(string[i] + " ");
            }else{
                System.out.print(string[i]);
            }
        }
        System.out.println();
    }
}