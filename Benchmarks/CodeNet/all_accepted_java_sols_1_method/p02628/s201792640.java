import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)arr.add(sc.nextInt());
        Collections.sort(arr);
        for(int j=0;j<k;j++)s += arr.get(j);
        System.out.println(s);
    }
}
