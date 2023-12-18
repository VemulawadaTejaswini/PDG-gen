import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer k = sc.nextInt();
        Integer res = 0;
        
        if(a>=k){
            res += k;
            System.out.println(res);
        }
        else {
            res += a;
            k = k-a;
            if(b>=k){
                System.out.println(res);
            }
            else{
                k = k-b;
                res -= k;
                System.out.println(res);
            }
        }


    }
}
