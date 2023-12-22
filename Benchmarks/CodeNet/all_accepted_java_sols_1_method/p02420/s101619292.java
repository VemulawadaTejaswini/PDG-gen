import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String a = sc.next();
            if(a.equals("-")){
                break;
            }
            int m = sc.nextInt();
            int h;
            for(int i = 0; i < m; i++){
                h = sc.nextInt();
                a = a.substring(h) + a.substring(0, h);
            }
            System.out.println(a);
        }
        sc.close();
    }
}
