import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Deque;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] board = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<9; i++){
            if(i==3||i==6) st = new StringTokenizer(br.readLine(), " ");
            board[i] = Integer.parseInt(st.nextToken());
        }
        final Deque<state> q = new ArrayDeque<state>();
        final BitSet cl = new BitSet(362880);
        q.add(new state(board, 0));
        cl.set(hash(board));
        int minstep = -1;
        while(!q.isEmpty()){
            final state stat = q.remove();
            if(hash(stat.board)==46233){
                minstep = stat.step;
                break;
            }
            int f;
            for(f = 0; f<9&&stat.board[f]!=0; f++);
            if(f%3!=0){
                final int[] next = Arrays.copyOf(stat.board, stat.board.length);
                next[f] = next[f-1];
                next[f-1] = 0;
                final int h = hash(next);
                if(!cl.get(h)){
                    cl.set(h);
                    q.add(new state(next, stat.step+1));
                }
            }
            if(f%3!=2){
                final int[] next = Arrays.copyOf(stat.board, stat.board.length);
                next[f] = next[f+1];
                next[f+1] = 0;
                final int h = hash(next);
                if(!cl.get(h)){
                    cl.set(h);
                    q.add(new state(next, stat.step+1));
                }
            }
            if(f>2){
                final int[] next = Arrays.copyOf(stat.board, stat.board.length);
                next[f] = next[f-3];
                next[f-3] = 0;
                final int h = hash(next);
                if(!cl.get(h)){
                    cl.set(h);
                    q.add(new state(next, stat.step+1));
                }
            }
            if(f<6){
                final int[] next = Arrays.copyOf(stat.board, stat.board.length);
                next[f] = next[f+3];
                next[f+3] = 0;
                final int h = hash(next);
                if(!cl.get(h)){
                    cl.set(h);
                    q.add(new state(next, stat.step+1));
                }
            }
        }
        System.out.println(minstep);
    }
    private static int hash(int[] board){
        int h = board[0];
        for(int i = 1; i<8; i++){
            h *= 9-i;
            h += board[i];
            for(int j = 0; j<i; j++){
                if(board[j]<board[i]) --h;
            }
        }
        return h;
    }
}

class state{
    final int[] board;
    final int step;
    state(int[] board, int step){
        this.board = board;
        this.step = step;
    }
}