import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Deque<Integer> g = new ArrayDeque<Integer>();
        final Deque<lake> lakes = new ArrayDeque<lake>();
        final String in = br.readLine();
        for(int i = 0; i<in.length(); i++){
            if(in.charAt(i)=='\\'){
                g.addLast(i);
            }else if(in.charAt(i)=='/'){
                if(!g.isEmpty()){
                    final int left = g.pollLast();
                    int area = i-left;
                    while(!lakes.isEmpty()&&left<lakes.peekLast().getLeft()){
                        area += lakes.pollLast().getArea();
                    }
                    lakes.addLast(new lake(left, area));
                }
            }
        }
        int sum = 0;
        for(final lake e:lakes){
            sum += e.getArea();
        }
        out.println(sum);
        out.print(lakes.size());
        for(final lake e:lakes){
            out.print(' ');
            out.print(e.getArea());
        }
        out.println();
        out.flush();
    }
}

class lake{
    private final int area;
    private final int left;
    public lake(int left, int area){
        this.area = area;
        this.left = left;
    }
    final public int getArea(){
        return area;
    }
    final public int getLeft(){
        return left;
    }
}