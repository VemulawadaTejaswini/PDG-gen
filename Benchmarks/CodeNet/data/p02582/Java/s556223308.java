import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count = 0;
        if(s.charAt(0) == 'R'){
            count++;
        }
        for(int i=1; i<3; i++){
            if(s.charAt(i-1) == 'R' && s.charAt(i) == 'R'){
                count++;
            }
        }
        System.out.println(count);
    }
}