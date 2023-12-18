import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> ad = new ArrayDeque<Integer>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=n%2)ad.offerLast(sc.nextInt());
            else{
                ad.offerFirst(sc.nextInt());
            }
        }
        for (Integer num : ad) {
            System.out.print(num+" ");
        }
    }
}