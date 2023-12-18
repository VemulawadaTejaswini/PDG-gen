import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int anc = 0;
       
        if(L%d == 0){
            anc = (R/d) - (L/d) + 1;
        }else{
            anc = (R/d) - (L/d);
        }
        System.out.println(anc);
    }
}
