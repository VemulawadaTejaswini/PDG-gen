import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                int count = 0;
                for (; i < s.length() && s.charAt(i) == 'R'; i++,count++) ;
                if(max < count){
                    max = count;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}