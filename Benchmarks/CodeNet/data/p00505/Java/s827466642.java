import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[]{0,0,0,0};
        
        while(sc.hasNext()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            Collections.sort(list);
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);
            
            if(a+b <= c) break;
            if(a*a + b*b == c*c){
                ans[0]++;
                ans[1]++;
            }else if(a*a + b*b > c*c){
                ans[0]++;
                ans[2]++;
            }else{
                ans[0]++;
                ans[3]++;
            }
            
            
        }
        System.out.println( ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3]);
    }
}

