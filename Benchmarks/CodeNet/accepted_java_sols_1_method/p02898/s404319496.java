import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> h = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            int g= sc.nextInt();
            h.add(g);
        }
        Collections.sort(h);
        int count=0;
        for(int s: h){
            if (s>=k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}