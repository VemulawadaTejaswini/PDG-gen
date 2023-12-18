

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,List<Integer>> t = new HashMap<>();
        Map<Integer,List<Integer>> f = new HashMap<>();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            List<Integer> tt = new ArrayList<>();
            List<Integer> tf = new ArrayList<>();
            for(int j = 0;j < a;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(y == 1){
                    tt.add(x - 1);
                }else{
                    tf.add(x - 1);
                }
            }
            t.put(i,tt);
            f.put(i,tf);
        }
        int result = 0;
        for(int i = 0;i < (1 << n);i++){
            boolean[] trust = new boolean[n];
            int ti = 0;
            for(int j = 0;j < n;j++){
                if((1 & i >> j) == 1){
                    trust[j] = true;
                    ti++;
                }else{
                    trust[j] = false;
                }
            }
            boolean flag = true;
            NEXT:
            for(int j = 0;j < n;j++){
                boolean trustable = trust[j];
                if(!trustable){
                    continue;
                }
                for(int tp : t.get(j)){
                    if(!trust[tp]){
                        flag = false;
                        break NEXT;
                    }
                }
                for(int fp : f.get(j)){
                    if(trust[fp]){
                        flag = false;
                        break NEXT;
                    }
                }
            }
            if(flag){
                if(result < ti){
                    result = ti;
                }
            }
        }
        System.out.println(result);
    }
}