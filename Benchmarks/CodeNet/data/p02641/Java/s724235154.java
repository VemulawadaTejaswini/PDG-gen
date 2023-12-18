import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        String[] tokens = br.readLine().split(" ");
        int x = Integer.parseInt(tokens[0]);
        int n = Integer.parseInt(tokens[1]);
        Set<Integer> set = new HashSet<>();
        if(n>0){
            tokens = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                set.add(Integer.parseInt(tokens[i]));
            }
        }
        int ans = x;
        for(int diff=0;diff<=Integer.MAX_VALUE;diff++){
            int left = x-diff;
            int right = x+diff;
            if(!set.contains(left)){
                ans = left;
                break;
            }
            if(!set.contains(right)){
                ans = right;
                break;
            }
        }
        System.out.println(ans);
    }




    private static class Pair{
        int first,second;

        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

        public int hashCode(){
            return Objects.hash(first,second);
        }

        public boolean equals(Object obj){
            if(obj!=null || !(obj instanceof  Pair))
                return false;
            Pair pair = (Pair)obj;
            return pair.first == first && pair.second == second;
        }
    }




}