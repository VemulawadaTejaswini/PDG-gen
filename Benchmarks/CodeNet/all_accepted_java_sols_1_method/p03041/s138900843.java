import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String si = s.substring(i,i+1);
            if(i+1 == k){
                str.append(si.toLowerCase());
            }else{
                str.append(si);
            }
        }

        System.out.println(str.toString());

        sc.close();
    }
}
