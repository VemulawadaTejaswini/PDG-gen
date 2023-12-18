import java.util.*;

public class Main {

    static int k;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        if(h<w){
            if(n%w==0){
                k=n/w;
                System.out.println(k);
            }else {
                k = n / w + 1;
                System.out.println(k);
            }
        }else{
            if(n%h==0){
                k=n/h;
                System.out.println(k);
            }else {
                k = n / h + 1;
                System.out.println(k);
            }
        }

    }
}
