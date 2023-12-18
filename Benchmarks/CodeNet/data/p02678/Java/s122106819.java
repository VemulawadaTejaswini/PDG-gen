import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0;i < m;i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        Map<Integer, List<Integer>> result = new HashMap<>();
        search(n, m, a, b, 0, new ArrayList<>(), result);
        System.out.println("Yes");
        for(int i = 1;i < n;i++) {
            System.out.println(result.get(Integer.valueOf(i)).get(0) + 1);
        }
    }

    public static void search(int n, int m, int[] a, int[] b, int room, List<Integer> footprints, Map<Integer, List<Integer>> result) {
        if(footprints.contains(Integer.valueOf(room))) return;
        if(room == 0) {
            footprints.add(Integer.valueOf(room));
            List<Integer> roomCost = new ArrayList<>();
            roomCost.add(Integer.valueOf(room));
            roomCost.add(Integer.valueOf(0));
            result.put(Integer.valueOf(room), roomCost);
            for(int i = 0;i < m;i++) {
                if(a[i] == room) {
                    search(n, m, a, b, b[i], footprints, result);
                }
                if(b[i] == room) {
                    search(n, m, a, b, a[i], footprints, result);
                }
            }
            return;
        }
        Integer preRoom = footprints.get(footprints.size() - 1);
        List<Integer> preRoomCost = result.get(preRoom);
        List<Integer> thisRoomCost = result.get(Integer.valueOf(room));
        if(thisRoomCost == null) {
            thisRoomCost = new ArrayList<>();
            thisRoomCost.add(preRoom);
            thisRoomCost.add(preRoomCost.get(1) + 1);
        }
        else {
            if(thisRoomCost.get(1) > preRoomCost.get(1) + 1) {
                thisRoomCost.set(0, preRoom);
                thisRoomCost.set(1, Integer.valueOf(preRoomCost.get(1) + 1));
            }
            else {
                return;
            }
        }
        result.put(Integer.valueOf(room), thisRoomCost);
        footprints.add(Integer.valueOf(room));
        for(int i = 0;i < m;i++) {
            if(a[i] == room) {
                search(n, m, a, b, b[i], footprints, result);
            }
            if(b[i] == room) {
                search(n, m, a, b, a[i], footprints, result);
            }
        }

        footprints.remove(footprints.size() - 1);
        return;
    }

}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
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
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}