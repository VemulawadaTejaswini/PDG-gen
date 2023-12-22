import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        int r=0,b=0;
        for (int i = 0; i < N ; i++) {
            char c = s.charAt(i);
            if(c == 'R') r++;
            if(c == 'B') b++;
        }

        if(r >b ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
