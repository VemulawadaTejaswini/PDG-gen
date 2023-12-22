import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        int zero = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(li.size() != 0){
            int right = -1;
            for(int i = 0; i < li.size(); i++){
                if(li.get(i) == i+1){
                    right = i;
                }
            }
            if(right == -1){
                System.out.println(-1);
                return;
            }else{
                ans.add(li.get(right));
                li.remove(right);
            }
        }
        for(int i = n-1; i >= 0; i--){
            System.out.println(ans.get(i));
        }
    }
}