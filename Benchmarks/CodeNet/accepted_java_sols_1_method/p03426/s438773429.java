import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] buf;
        buf = reader.readLine().split(" ");
        int H = Integer.parseInt(buf[0]), W = Integer.parseInt(buf[1]), D = Integer.parseInt(buf[2]);
        TreeMap<Integer,int[]> tm = new TreeMap<>();
        for(int i=1;i<=H;i++){
            buf = reader.readLine().split(" ");
            for(int j=0;j<W;j++){
                int[] now = new int[]{i,j+1};
                int key = Integer.parseInt(buf[j]);
                tm.put(key,now);
            }
        }
        ArrayList<Integer>[] dic = new ArrayList[D]; // to record prefix sum
        for(int i=0;i<D;i++) dic[i]=new ArrayList<>();
        int[][] rec = new int[D][];
        while(tm.size()>0){
            int key = tm.firstKey();
            int[] now = tm.get(key);
            tm.remove(key);
            int j=key%D;
            if(dic[j].size()==0){
                dic[j].add(0);
                rec[j] = now;
            }else{
                int last = dic[j].get(dic[j].size()-1);
                int cur = Math.abs(rec[j][0]-now[0])+Math.abs(rec[j][1]-now[1]);
                dic[j].add(last+cur);
                rec[j] = now;
            }
        }
        PrintWriter out = new PrintWriter((System.out));
        buf = reader.readLine().split(" ");
        int q = Integer.parseInt(buf[0]);
        for(int i=0;i<q;i++){
            buf = reader.readLine().split(" ");
            int L = Integer.parseInt(buf[0]), R = Integer.parseInt(buf[1]);
            if(R==L){
                out.println(0);
                continue;
            }
            int key = L%D;
            out.println(dic[key].get((R-1)/D)-dic[key].get((L-1)/D));
        }
        out.flush();
    }
}
