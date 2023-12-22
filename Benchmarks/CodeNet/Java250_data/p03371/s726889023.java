import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a_price = Integer.parseInt(sc.next());
        int b_price = Integer.parseInt(sc.next());
        int merge_price = Integer.parseInt(sc.next());
        int n_a = Integer.parseInt(sc.next());
        int n_b = Integer.parseInt(sc.next());
        //String s = sc.next();
        if(a_price+b_price > merge_price*2){
            if(n_a>n_b){
                if(a_price>merge_price*2){
                    System.out.println(merge_price*n_a*2);
                }else{
                    System.out.println(merge_price*n_b*2+(n_a-n_b)*a_price);
                }
            }else{
                if(b_price>merge_price*2){
                    System.out.println(merge_price*n_b*2);
                }else{
                    System.out.println(merge_price*n_a*2+(n_b-n_a)*b_price);
                }
            }
        } else {
            System.out.println(a_price*n_a + b_price*n_b);
        }
    }
}