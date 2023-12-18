import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Tuples> T = new ArrayList<>();
        for(int i = 0;i < n;i++){
            long v = sc.nextLong();
            long w = sc.nextLong();
            char t = sc.next().charAt(0);
            long s = sc.nextLong();
            String d = sc.next();
            T.add(new Tuples(v,w,t,s,d));
        }

        Collections.sort(T);
        Iterator<Tuples> it = T.iterator();
        while(it.hasNext()){
            Tuples t = it.next();
            t.print();
        }
    }

    static class Tuples implements Comparable<Tuples>{
        long v,w,s;
        char t;
        String d;

        Tuples(long v,long w,char t,long s,String d){
            this.v = v;
            this.w = w;
            this.t = t;
            this.s = s;
            this.d = d;
        }

        public void print(){
            System.out.println(v+" "+w+" "+t+" "+s+" "+d);
        }

        public int compareTo(Tuples T){
            if(v < T.v) return -1;
            else if(v == T.v){
                if(w < T.w) return -1;
                else if(w == T.w){
                    if(t < T.t) return -1;
                    else if(t == T.t){
                        if(s < T.s) return -1;
                        else if(s == T.s)   return d.compareTo(T.d);
                        else return 1;
                    }
                    else return 1;
                }
                else return 1;
            }
            else return 1;
        }
    }
}
