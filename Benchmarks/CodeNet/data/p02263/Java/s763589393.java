import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = line.length;
        int[] arr = new int[n];
        int count = 0;
        int temp;

        int v1;
        int v2;
        Integer ans;
        ArrayDeque<Integer> stk = new ArrayDeque<Integer>();
        for(int i = 0; i < n; i++){
            if(line[i].equals("+")){
                v1 = stk.pop().intValue();
                v2 = stk.pop().intValue();
                ans = Integer.valueOf(v1 + v2);
                stk.push(ans);
            }else if(line[i].equals("-")){
                v1 = stk.pop().intValue();
                v2 = stk.pop().intValue();
                ans = Integer.valueOf(v2 - v1);
                stk.push(ans);
            }else if(line[i].equals("*")){
                v1 = stk.pop().intValue();
                v2 = stk.pop().intValue();
                ans = Integer.valueOf(v1 * v2);
                stk.push(ans);
            }else{
                stk.push(Integer.valueOf(line[i]));
            }
        }
        System.out.println(stk.pop().intValue());
        
        



    }
}