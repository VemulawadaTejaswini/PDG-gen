import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0; int t = 0;
        for (int i = 0; i < n; i++) {
            String a = sc.next(); String b = sc.next();
            if (a.compareTo(b) > 0) {
                t+=3;
            }else if(a.compareTo(b) < 0){
                h+=3;
            }else{
                t++;
                h++;
            }
            
        }
        System.out.printf("%d %d\n", t , h);
    }
}
