/**
 * Created by abhishek on 7/31/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int array[] = new int[n + 1];
        Arrays.fill(array,1);
        //ArrayList<Integer>list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        set.add(1);
        for(int i = 1;i <= m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(set.contains(a)){
                set.add(b);
            }
            array[a]--;array[b]++;
            if(array[a] == 0)set.remove(a);
        }
        System.out.print(set.size());
    }
}
