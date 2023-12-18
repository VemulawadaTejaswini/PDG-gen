import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int S, h, m, s;
        
        S = sc.nextInt();
        
        h = S / 60 / 60;
        m = S / 60 % 60;
        s = S % 60;
        
        System.out.println(h + ":" + m + ":" + s);
    }
}
