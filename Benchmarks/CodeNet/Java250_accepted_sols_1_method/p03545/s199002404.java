import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums =  br.readLine().split("");
        
        int total;
        ArrayList<String> expr = new ArrayList<>();
        StringBuilder buff = new StringBuilder();
        
        for(int bit=0; bit<(1<<nums.length-1); bit++){
            total = Integer.parseInt(nums[0]);
            buff.append(nums[0]);
            for(int i=0; i<nums.length-1; i++){
                if((bit&1<<i)==1<<i){
                    total += Integer.parseInt(nums[i+1]);
                    buff.append("+" + nums[i+1]);
                } else if((bit&1<<i)==0){
                    total -= Integer.parseInt(nums[i+1]);
                    buff.append("-" + nums[i+1]);
                }
            }
            if(total==7)expr.add(buff.toString() + "=7");
            buff.delete(0, buff.length());
        }
        System.out.println(expr.get(0));
    }
}