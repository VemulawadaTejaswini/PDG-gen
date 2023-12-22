import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        char[] sa=fsc.next().toCharArray();
        char[] sb=fsc.next().toCharArray();
        char[] sc=fsc.next().toCharArray();
        fsc.close();
        int a=0, b=0, c=0;
        int turn=0;
        while(true){
            if(turn==0){
                if(a==sa.length){
                    System.out.println('A');
                    return;
                }
                if(sa[a]=='a'){

                } else if(sa[a]=='b'){
                    turn=1;
                } else{
                    turn=2;
                }
                a++;
                continue;
            } else if(turn==1){
                if(b==sb.length){
                    System.out.println('B');
                    return;
                }
                if(sb[b]=='a'){
                    turn=0;
                } else if(sb[b]=='b'){
                    
                } else{
                    turn=2;
                }
                b++;
                continue;
            } else{
                if(c==sc.length){
                    System.out.println('C');
                    return;
                }
                if(sc[c]=='a'){
                    turn=0;
                } else if(sc[c]=='b'){
                    turn=1;
                } else{
                    
                }
                c++;
                continue;
            }
        }
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
