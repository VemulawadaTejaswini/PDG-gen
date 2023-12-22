import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
        String s;
        int m, h;
        Scanner sc = new Scanner(System.in);
        while(true){
            s = sc.next();
            if(s.equals("-")) break;
            m = sc.nextInt();
            for(int i = 0; i < m; i ++){
                h = sc.nextInt();
                s = s.substring(h) + s.substring(0, h);
            }
            System.out.println(s);
        }

    }
}
