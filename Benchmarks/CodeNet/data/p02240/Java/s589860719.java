import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;
//import java.util.stream.IntStream;



public class Main {


    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int[] arr = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
            int n = arr[0];
            int m = arr[1];

            Map<Integer, List<Integer>> link = new HashMap<>();
            for(int i=0;i<n;i++){
                link.put(i, new ArrayList<>());
            }
            int[] colors = new int[n];

            for(int i=0;i<m;i++){
                int[] tmp = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
                link.get(tmp[0]).add(tmp[1]);
                link.get(tmp[1]).add(tmp[0]);
            }

            int color = 1;
            for(int i=0;i<n;i++){
                if(colors[i] == 0){
                    dfs(i, colors, link, color++);
                }
            }
        
            int q = Integer.parseInt(br.readLine());
            for(int i=0;i<q;i++){
                int[] tmp = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();
                
                    System.out.println(colors[tmp[0]] == colors[tmp[1]] ? "yes" : "no");
                
            }


        } catch (IOException e){e.printStackTrace();}

    }


    public static void dfs(int start, int[] colors, Map<Integer, List<Integer>> link, int color){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        
        while(!stack.empty()){
            int cur = stack.pop();
            if(colors[cur] != 0){
                continue;
            } else {
                colors[cur] = color;
            }
            List<Integer> curLink = link.get(cur);
            
            for(int i=0;i<curLink.size();i++){
                stack.push(curLink.get(i));
            }
        }

    }
}

