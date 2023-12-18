import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        List<LinkedList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new LinkedList<>());

        int a,b;
        for(int i=0;i<m;i++){
            a = fs.nextInt()-1;
            b = fs.nextInt()-1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int[] prev = new int[n];
        Arrays.fill(prev,-1);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while(queue.size()>0){
            int p = queue.poll();
            for(Integer i: graph.get(p)){
                if(prev[i]==-1){
                    prev[i] = p;
                    queue.add(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<n;i++){
            if(prev[i]==-1){
                System.out.println("No");
                return;
            }else{
                sb.append(prev[i]+1);
                if(i<n-1)sb.append('\n');
            }
        }
        System.out.println("Yes");
        System.out.println(sb.toString());

    }
    static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte(){
            if(ptr < buflen){
                return true;
            }else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen <= 0){
                    return false;
                }
            }
            return true;
        }

        private int readByte(){
            if(hasNextByte())return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c){
            return 33<=c && c<=126;
        }

        public boolean hasNext(){
            while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
            return hasNextByte();
        }

        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)){
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong(){
            if(!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if(b == '-'){
                minus = true;
                b = readByte();
            }
            if(b < '0' || '9' < b){
                throw new NumberFormatException();
            }
            while(true){
                if('0' <= b && b<='9'){
                    n*=10;
                    n+=b-'0';
                }else if(b==-1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt(){
            long nl = nextLong();
            if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
            return (int)nl;
        }
        public double nextDouble(){return Double.parseDouble(next());}
    }
}