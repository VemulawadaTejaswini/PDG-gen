
import java.io.*;
import java.util.*;
import java.math.*;

public class Main { 
    public static final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static void main(String[] args) throws java.lang.Exception { 
        Reader pm =new Reader(); 
        //Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        while(t-- > 0){
            long n = pm.nextLong();
            TreeSet<Long> l = new TreeSet<>();
            TreeSet<Long> r = new TreeSet<>();
            l.add(1l);
            r.add(26l);
            HashMap<Long, Integer> hm = new HashMap<>();
            hm.put(1l, 1);
            int pow = 2;

            while(pow < 11) {
                l.add(r.last() + 1);
                long toAdd = (long)Math.pow(26, pow) + l.last() - 1;
                r.add(toAdd);
                hm.put(l.last(), pow);
                pow++;
            }
            // System.out.println(l);
            // System.out.println(r);

            long low = l.floor(n);
            int pg = hm.get(low);
            long got = (long)Math.pow(26, pg) + 1;
            StringBuffer sb = new StringBuffer();
            while(pg-- > 0) 
                sb.append('a');
            long dif = n - low;
            int ind = sb.length()-1;
            //System.out.println(dif+" "+low);
            while(dif-- > 0) {
                char pre = sb.charAt(ind);
                if(pre == 'z'){
                    ind--;
                    if(ind < 0)
                        break;
                }
                int prn = (int)pre;
                sb.setCharAt(ind, (char)(prn+1));
            }
            //System.out.println(sb);
            System.out.println(indexToColumnItr(n, ALPHABET).toLowerCase());
        }
        //end of tests
        
    }
    //end of main class
    public static String indexToColumnItr(long index, char[] alphabet) {
        if (index <= 0)
            throw new IndexOutOfBoundsException("index must be a positive number");
        if (index <= alphabet.length)
            return Character.toString(alphabet[(int)index - 1]);
        StringBuffer sb = new StringBuffer();
        while (index > 0) {
            index--;
            sb.insert(0, alphabet[(int)(index % alphabet.length)]);
            index /= alphabet.length;
        }
        return sb.toString();
    }

    static int countInRange(int arr[], int n, int x, int y) { 
        // initialize result 
        int count = 0; 
        count = upperIndex(arr, n, y) -  
                lowerIndex(arr, n, x) + 1; 
        return count; 
    } 
    
    
    static int lowerIndex(int arr[], int n, int x) { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] >= x) 
                h = mid - 1; 
            else
                l = mid + 1; 
        } 
        return l; 
    } 
      
    // function to find last index <= y 
    static int upperIndex(int arr[], int n, int y) { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] <= y) 
                l = mid + 1; 
            else
                h = mid - 1; 
        } 
        return h; 
    }
    
    public static StringBuilder dec_to_bin(long n) {
        // decimal to binary upto 30 binaries
        if(n==0) {
            StringBuilder str=new StringBuilder("");
            for(int i=0;i<30;i++) {
                str.append("0");
            }
            return str;
        }
        StringBuilder str=new StringBuilder("");
        while(n!=0) {
            str.append(n%2L);
            n/=2L;
        }
        str=str.reverse();
        StringBuilder tmp_str=new StringBuilder("");
        int len=str.length();
        while(len!=30) {
            tmp_str.append("0");
            len++;
        }
        tmp_str.append(str);
        return tmp_str;
    }
    
    private static int binarySearchPM(int[] arr, int key){
        int n = arr.length;
        int mid = -1;
        int begin = 0,end=n;
        while(begin <= end){
            mid = (begin+end) / 2;
            if(mid == n){
                return n;
            }
            if(key < arr[mid]){
                end = mid-1;
            } else if(key > arr[mid]){
                begin = mid+1;
            } else {
                return mid;
            }
        }
        //System.out.println(begin+" "+end);
        return -begin; //expected Index
    }
    
    static class Reader { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
}    