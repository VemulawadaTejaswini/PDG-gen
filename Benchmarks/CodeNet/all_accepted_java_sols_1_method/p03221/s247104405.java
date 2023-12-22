//https://atcoder.jp/contests/abc113/tasks/abc113_c

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<Long,Integer> PY = new HashMap<>();
        ArrayList<Long> Y = new ArrayList<>();
        for (int i=0;i<M;i++){
            int p = sc.nextInt();
            long y = sc.nextLong();
            Y.add(y);
            PY.put(y,p);
        }
        sc.close();
        ArrayList<Long> ori = new ArrayList<>(Y);
        Collections.sort(Y);
        HashMap<Integer,Integer> city = new HashMap<>();
        HashMap<Long,String> ans = new HashMap<>();
        for (long x:Y){
            if (city.containsKey(PY.get(x))){
                city.put(PY.get(x),city.get(PY.get(x))+1);
            } else {
                city.put(PY.get(x),1);
            }
            StringBuffer up = new StringBuffer(String.valueOf(PY.get(x)));
            while (up.length()<6){
                up.insert(0, "0");
            }
            StringBuffer under = new StringBuffer(String.valueOf(city.get(PY.get(x))));
            while (under.length()<6){
                under.insert(0, "0");
            }
            ans.put(x,String.valueOf(up)+String.valueOf(under));
        }
        for (long x:ori){
            System.out.println(ans.get(x));
        }
    }
}