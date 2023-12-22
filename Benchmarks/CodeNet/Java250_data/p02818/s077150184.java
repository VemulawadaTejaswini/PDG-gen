import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next()),b=Long.parseLong(sc.next()),k=Long.parseLong(sc.next());
        if(k>=a){
            k-=a;
            b = Math.max(b-k,0);
            System.out.println(0+" "+b);
        } else {
            System.out.println(a-k+" "+b);
        }
    }
}