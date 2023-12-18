import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author kep
 * @date 2019-10-17
 */
public class Main {


    private static int[] a = new int[200005];
    private static int[] ans = new int[200005];
    private static int[] count = new int[200005];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<n;i++){
            int b = scanner.nextInt();
            set.add(b);
            count[b]++;
        }
        boolean flag = true;
        for(int i = 0;i<n;i++){
            Iterator<Integer> it = set.iterator();
            Integer first = it.next();
            while(first == a[i] && it.hasNext()){
                first = it.next();
            }
            if(first != a[i]){
                ans[i] = first;
                count[first]--;
                if(count[first] == 0) {
                    it.remove();
                }
            }else{
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println("No");
        }else{
            for(int i =0;i<n;i++){
                if(i == 0){
                    System.out.print(ans[i]);
                }else{
                    System.out.print(" "+ans[i]);
                }
            }
            System.out.println();
        }


    }



}
