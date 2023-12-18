import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                Scanner sc = new Scanner(System.in);

                while(true){
                        int AN = sc.nextInt();
                        int BN = sc.nextInt();
                        if(AN == 0 && BN == 0){
                                break;
                        }
                        int R = sc.nextInt();
                        int[][] A = new int[AN][2];
                        for(int i = 0;i < AN; ++i){
                                A[i][0] = sc.nextInt();
                                A[i][1] = sc.nextInt();
                        }
                        TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<Integer, TreeSet<Integer>>();
                        TreeSet<Integer> ts;
                        for(int i = 0;i < BN; ++i){
                                int x = sc.nextInt();
                                int y = sc.nextInt();
                                if((ts = tm.get(x)) == null){
                                        ts = new TreeSet<Integer>();
                                        tm.put(x , ts);
                                }
                                ts.add(y);
                        }
                        int e = 0;
                        for(int i = 0;i < AN; ++i){
                                int x = A[i][0];
                                int y = A[i][1];
                                for(int j = Math.max(x-4*R,0); j <= x+4*R; ++j){
                                        if((ts = tm.get(j)) != null){
                                                Iterator<Integer> it = ts.iterator();
                                                while(it.hasNext()){
                                                        int t = it.next();
                                                        if(t < y-4*R){
                                                                continue;
                                                        }
                                                        if(y+4*R < t){
                                                                break;
                                                        }
                                                        if(Math.pow(Math.abs(x-j),2)+Math.pow(Math.abs(y-t),2) <= 16*R*R){
                                                                ++e;
                                                        }
                                                }
                                        }
                                }
                        }
                        System.out.println(e);
                }
        }
}