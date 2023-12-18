import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final List<List<Integer>> factors = new ArrayList<>();
    private static final int MAX = 1000000;
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] freq = new int[MAX+1];
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(tokens[i]);
            freq[nums[i]]++;
        }
        if(freq[1]>0){
            if(freq[1]==1)
                System.out.println(1);
            else
                System.out.println(0);
        }else{
            int count=0;
            Set<Integer> forbidden = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                forbidden.addAll(multiples(nums[i]));
                if(freq[nums[i]]>1)
                    forbidden.add(nums[i]);
            }
            for(int i=0;i<nums.length;i++){
                if(!forbidden.contains(nums[i])){
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    private static Set<Integer> multiples(int num){
        Set<Integer> set = new HashSet<>();
        for(int i=2*num;i<=MAX;i+=num){
            set.add(i);
        }
        return set;
    }
}