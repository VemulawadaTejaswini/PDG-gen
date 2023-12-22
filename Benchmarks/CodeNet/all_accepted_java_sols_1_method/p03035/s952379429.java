import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if(a <= 5) {
            System.out.println(0);
        }else if(a < 13) {
            System.out.println(b/2);
        }else {
            System.out.println(b);
        }
    }
}