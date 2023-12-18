import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int all = 360;
        int koubaisuu;
        int anc;
        if(all%A == 0){
            anc = all/A;
        }else{
            all *= A;
            anc = all/A;
        }
        System.out.println(act);
    }
}