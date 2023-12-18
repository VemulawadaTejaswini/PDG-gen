import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s1[] = br.readLine().trim().split(" ");
        String s2[] = br.readLine().trim().split(" ");
        String s3[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int k = Integer.parseInt(s1[2]);
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++) ar.add(Integer.parseInt(s2[i]));
        for(int i=0;i<m;i++) ar.add(Integer.parseInt(s3[i]));
        Collections.sort(ar);
        int p1=0;long sum=0;
        while(p1<n+m && sum+ar.get(p1)<=k)sum+=ar.get(p1++);
        out.println(p1);
        out.flush();
    }
}