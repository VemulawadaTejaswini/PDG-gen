import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet();
        hs.add(Integer.parseInt(st.nextToken()));
        hs.add(Integer.parseInt(st.nextToken()));
        hs.add(Integer.parseInt(st.nextToken()));

        
        System.out.println(hs.size());
    }
}
