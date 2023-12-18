import java.io.*;
import java.util.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static int c = 0;
        static Deque<Integer> in;
        static ArrayList<Integer> sorted;

        static int pos(int e, int l, int r){
                int m = (r-l+1)/2;
                if(e>sorted.get(r))
                        return r+1;
                else if(e<sorted.get(l))
                        return l;

                while(!(e<sorted.get(m) && e>sorted.get(m-1))){
                        if(sorted.get(m)>e)
                                l=m;
                        else{
                                r=m;
                        }
                        pos(e, l, r);
                }
                return m;
        }

        static int sort(int e){
                int n = sorted.size();
                if(n==0){
                        sorted.add((Integer)e);
                        return 0;
                }else if(n==1){
                        if(sorted.get(0) < e){
                                sorted.add((Integer)e);
                                return 1;
                        }else{
                                sorted.add(0, (Integer)e);
                                return 0;
                        }
                }
                int p = pos(e, 0, sorted.size()-1);
                sorted.add(p, (Integer)e);
                return p;
        }

        public static void main(String[] args) throws IOException{
                int n = Integer.parseInt(br.readLine());
                in = new ArrayDeque<Integer>(n);
                String[] line = br.readLine().split(" ");
                for(String s : line)
                        in.push(Integer.parseInt(s));
                sorted = new ArrayList<Integer>();
                while(!in.isEmpty()){
                        int e = in.pop();
                        c += sort(e);
                }
                System.out.println(c);
        }
}