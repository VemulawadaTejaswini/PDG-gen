import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0 ;
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            list.add(p);
        }
        Collections.sort(list);
        for(int i=0;i<k;i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}