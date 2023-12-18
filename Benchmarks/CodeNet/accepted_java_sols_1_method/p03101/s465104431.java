import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int h=sc.nextInt();
        int w=sc.nextInt();
        
        if(H==h && W==w) {
            System.out.println(0);
        } else {
            System.out.println((H-h) * (W-w));
        }
    }
}