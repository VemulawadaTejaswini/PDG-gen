import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int out = 0;
        for(int i = 0; i < n - 2; i++){
            if(s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C') out++;
        }
        System.out.println(out);
        scan.close();
    }
}