import java.util.Scanner;

//0305
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int r = sc.nextInt() ;
            int t = sc.nextInt() ;
            boolean fr = r % 100 == 0;
            boolean ft = t % 30 == 0;
            r /= 100;
            t /= 30;
            if (fr && ft) {
                System.out.println(r + t * 5);
            }else if(fr){
                System.out.println((r+t*5)+" "+(r+t*5+5));
            }else if(ft) {
                System.out.println((r+t*5)+" "+(r+t*5+1));
            }else {
              System.out.println((r+t*5)+" "+(r+t*5+1)+" "+(r+t*5+5)+" "+(r+t*5+6));  
            }
        }

    }
}
