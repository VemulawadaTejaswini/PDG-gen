import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ll.add(sc.nextInt());
        }
        long ans2 = 0;
        for (int i = 0; i < k; i++) {
            ans2 += ll.get(i);
        }
        if(ans2 >= n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}
