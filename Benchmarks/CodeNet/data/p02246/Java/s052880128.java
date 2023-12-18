import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final byte[] board = new byte[16];
        StringTokenizer st = null;
        for(int i = 0; i<16; i++){
            if(i%4==0) st = new StringTokenizer(br.readLine(), " ");
            board[i] = (byte)Integer.parseInt(st.nextToken());
        }
        final PQ q = new PQ();
        final Set<Long> cl = new HashSet<Long>();
        q.add(new state(board, 0), md(board));
        int minstep = 45;
        final int dx[] = {1, 0, -1, 0};
        final int dy[] = {0, 1, 0, -1};
        while(!q.isEmpty()){
            final state stat = q.remove();
            final long nh = hash(stat.board);
            if(nh==1401602636313L){
                minstep = stat.step;
                break;
            }
            if(cl.contains(nh)) continue;
            cl.add(nh);
            int f;
            for(f = 0; f<16&&stat.board[f]!=0; f++);
            for(int i = 0; i<4; i++){
                final int fx = f%4+dx[i];
                final int fy = f/4+dy[i];
                if(fx<0||3<fx||fy<0||3<fy) continue;
                final byte[] next = Arrays.copyOf(stat.board, stat.board.length);
                next[f] = next[fy*4+fx];
                next[fy*4+fx] = 0;
                final long h = hash(next);
                if(!cl.contains(h)){
                    q.add(new state(next, stat.step+1), stat.step+1+md(next));
                }
            }
        }
        System.out.println(minstep);
    }
    private static long hash(byte[] board){
        long h = board[0];
        for(int i = 1; i<15; i++){
            h *= 16-i;
            h += board[i];
            for(int j = 0; j<i; j++){
                if(board[j]<board[i]) --h;
            }
        }
        return h;
    }
    private static int md(byte[] board){
        int md = 0;
        for(int i = 0; i<16; i++){
            if(board[i]==0) continue;
            final int num = board[i]-1;
            md += Math.abs(num/4-i/4);
            md += Math.abs(num%4-i%4);
        }
        return md;
    }
}

class state{
    final byte[] board;
    final int step;
    state(byte[] board, int step){
        this.board = board;
        this.step = step;
    }
}
class PQ{
    int length;
    int head;
    ArrayDeque<state>[] data;
    @SuppressWarnings("unchecked")
    PQ(){
        length = 0;
        head = Integer.MAX_VALUE;
        data = new ArrayDeque[45];
        for(int i = 0; i<45; i++){
            data[i] = new ArrayDeque<state>();
        }
    }
    boolean isEmpty(){
        return length==0;
    }
    boolean add(state e, int minstep){
        if(minstep>=45) return false;
        if(minstep<head) head = minstep;
        ++length;
        return data[minstep].add(e);
    }
    state remove(){
        final state ret = data[head].remove();
        --length;
        for(; head<45&&data[head].isEmpty(); ++head);
        return ret;
    }
}