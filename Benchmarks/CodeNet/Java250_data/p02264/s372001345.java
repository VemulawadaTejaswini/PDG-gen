import java.util.*;
import java.io.*;

class Main{
        static ArrayDeque<Elem> dq;
        static int size;
        static int max;
        static int time = 0;

        static class Elem{
                String s;
                Integer i;
                public Elem(String s, Integer i){
                        this.s = s;
                        this.i = i;
                }
                public int minus(int i){
                        int j = this.i>=i ? i : this.i;
                        this.i -= j;
                        return j;
                }
        }
        static void runqueue(){
                while(!dq.isEmpty()){
                        Elem e = dq.pollFirst();
                        time += e.minus(max);

                        if(e.i>0)
                                dq.offerLast(e);
                        else
                                System.out.println(e.s + " " + time);
                }
        }

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String[] line = br.readLine().split(" ");
                size = Integer.parseInt(line[0]);
                max = Integer.parseInt(line[1]);

                dq = new ArrayDeque<>();
                for(int i=0; i<size; i++){
                        line = br.readLine().split(" ");
                        Elem e = new Elem(line[0], Integer.parseInt(line[1]));
                        dq.offerLast(e);
                }
                runqueue();
        }
}