import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        long n = readLong();
        long ppMax = 0, ppMin = Long.MAX_VALUE, pnMax = 0, pnMin = Long.MAX_VALUE,
                npMax = 0, npMin = Long.MAX_VALUE, nnMax = 0, nnMin = Long.MAX_VALUE;
        ArrayList<Pair> ppMaxPair = new ArrayList<>(), pnMaxPair = new ArrayList<>(), npMaxPair = new ArrayList<>(), nnMaxPair = new ArrayList<>(),
                ppMinPair = new ArrayList<>(), pnMinPair = new ArrayList<>(), npMinPair = new ArrayList<>(), nnMinPair = new ArrayList<>();
        for (long l = 0; l < n; l++) {
            long x = readLong(), y = readLong();
            Pair p = new Pair(x, y);
            long man = Math.abs(x) + Math.abs(y);
            if (x >= 0 && y >= 0) {
                if (man > ppMax) {
                    ppMax = man;
                    ppMaxPair.add(p);
                } else if (man == ppMax) ppMaxPair.add(p);
                
                if (man < ppMin) {
                    ppMin = man;
                    ppMinPair.add(p);
                } else if (man == ppMin) ppMinPair.add(p);
            } else if (x >= 0) {
                if (man > pnMax) {
                    pnMax = man;
                    pnMaxPair.add(p);
                } else if (man == pnMax) pnMaxPair.add(p);

                if (man < pnMin) {
                    pnMin = man;
                    pnMinPair.add(p);
                } else if (man == pnMin) pnMinPair.add(p);
            } else if (y >= 0) {
                if (man > npMax) {
                    npMax = man;
                    npMaxPair.add(p);
                } else if (man == npMax) npMaxPair.add(p);

                if (man < npMin) {
                    npMin = man;
                    npMinPair.add(p);
                } else if (man == npMin) npMinPair.add(p);
            } else {
                if (man > nnMax) {
                    nnMax = man;
                    nnMaxPair.add(p);
                } else if (man == nnMax) nnMaxPair.add(p);

                if (man < nnMin) {
                    nnMin = man;
                    nnMinPair.add(p);
                } else if (man == nnMin) nnMinPair.add(p);
            }
        }
        
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.addAll(ppMaxPair);
        pairs.addAll(pnMaxPair);
        pairs.addAll(npMaxPair);
        pairs.addAll(nnMaxPair);
        pairs.addAll(ppMinPair);
        pairs.addAll(pnMinPair);
        pairs.addAll(npMinPair);
        pairs.addAll(nnMinPair);

        long max = 0;
        while (pairs.size() > 1) {
            Pair p = pairs.remove(0);
            for (Pair pair : pairs) {
                if (max < p.man(pair)) max = p.man(pair);
            }
        }

        System.out.print(max);
        
    }
    
    private static class Pair {
        long x;
        long y;
        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
        
        public long man(Pair p) {
            return Math.abs(x - p.x) + Math.abs(y - p.y);
        }
    }

    private static void read() {
        builder.setLength(0);
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) {
                    break;
                } else {
                    builder.appendCodePoint(b);
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static int readInt() {
        read();
        return Integer.parseInt(builder.toString());
    }

    private static int readInt(int radix) {
        read();
        return Integer.parseInt(builder.toString(), radix);
    }

    private static long readLong() {
        read();
        return Long.parseLong(builder.toString());
    }

    private static long readLong(int radix) {
        read();
        return Long.parseLong(builder.toString(), radix);
    }

    private static BigInteger readBigInteger() {
        read();
        return new BigInteger(builder.toString());
    }

    private static BigInteger readBigInteger(int radix) {
        read();
        return new BigInteger(builder.toString(), radix);
    }

    private static double readDouble() {
        read();
        return Double.parseDouble(builder.toString());
    }

    private static BigDecimal readBigDecimal() {
        read();
        return new BigDecimal(builder.toString());
    }

    private static float readFloat() {
        read();
        return Float.parseFloat(builder.toString());
    }

    private static void skipLine() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == '\n' || b == -1) {
                    break;
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static void skip() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) break;
            } catch (IOException e) {
                break;
            }
        }
    }

}
