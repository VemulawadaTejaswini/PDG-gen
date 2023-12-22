import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author C0117306
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        for (int i = 0; i < k; i++) {
            sum=sum+Collections.max(arrayList);
            arrayList.remove(Collections.max(arrayList)); 
        }
        System.out.println(sum);
    }
    
}
