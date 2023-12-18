import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
 
    public Main() {
        AOJ1175 obj = new AOJ1175();
        while(true){
            int n = in.nextInt();
            if(n==0)break;
            obj.doIt(n);
        }
    }
 
    class AOJ1175{
        boolean[] memo = new boolean[(1<<24)];
        void doIt(int n){
            Arrays.fill(memo,false);
            Data[] data = new Data[n];
            for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
            long bit = 0;
            for(int i=0;i<n;i++)bit += 1 << i;
            LinkedList<State> q = new LinkedList<State>();
            q.add(new State(bit, 0));
            int cnt[] = new int[n];
            int result = -1;
            while(q.size()>0){
                State now = q.remove();
                bit = now.bit;
                result = Math.max(result, now.num);
                Arrays.fill(cnt,0);
                for(int i=0;i<n;i++)for(int s=i-1;s>=0;s--)if((bit>>i)%2==1&&(bit>>s)%2==1){
                    if(Point2D.distance(data[i].x, data[i].y, data[s].x, data[s].y)<data[s].r+data[i].r)cnt[i]++;
                }
                for(int i=0;i<n;i++)for(int s=i+1;s<n;s++)if(data[i].color==data[s].color&&cnt[i]==0&&cnt[s]==0){
                    if(i==s||((bit>>i)%2==0)||((bit>>s)%2==0))continue;
                    long bit2 = bit-(1<<i)-(1<<s);
                    if(memo[(int)bit2])continue;
                    q.add(new State(bit2,now.num+2));
                }
                memo[(int)bit] = true;
            }
            System.out.println(result);
        }
 
        class State{
            long bit;
            int num;
            public State(long bit,int num){
                this.bit = bit;
                this.num = num;
            }
        }
 
        class Data{
            int x,y,color,r;
            public Data(int x,int y,int r,int color) {
                this.x = x;
                this.y = y;
                this.r = r;
                this.color = color;
            }
        }
    }
}