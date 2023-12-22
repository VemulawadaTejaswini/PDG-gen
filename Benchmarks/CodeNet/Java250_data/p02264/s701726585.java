import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final List<process> pl = new LinkedList<process>();
        String[] in = br.readLine().split(" ");
        final int n = Integer.parseInt(in[0]);
        final int q = Integer.parseInt(in[1]);
        int now = 0;
        for(int i = 0; i<n; i++){
            in = br.readLine().split(" ");
            final String name = in[0];
            final int time = Integer.parseInt(in[1]);
            if(time<=q){
                now += time;
                out.print(name);
                out.print(' ');
                out.println(now);
            }else{
                now += q;
                pl.add(new process(name, time-q));
            }
        }
        while(!pl.isEmpty()){
            final Iterator<process> i = pl.iterator();
            while(i.hasNext()){
                final process p = i.next();
                if(p.getTime()<=q){
                    now += p.getTime();
                    out.print(p.getName());
                    out.print(' ');
                    out.println(now);
                    i.remove();
                }else{
                    now += q;
                    p.setTime(p.getTime()-q);
                }
            }
        }
        out.flush();
    }
}

class process{
    private final String name;
    private int time;
    process(String name, int time){
        this.name = name;
        this.time = time;
    }
    public final String getName(){
        return name;
    }
    public final int getTime(){
        return time;
    }
    public final void setTime(int time){
        this.time = time;
    }
}