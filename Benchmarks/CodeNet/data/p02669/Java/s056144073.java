//package atcoder.AGC_44;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main (String[] args) throws Exception {

//        String s = "5\n" +
//                "11 1 2 4 8\n" +
//                "11 1 2 2 8\n" +
//                "32 10 8 5 4\n" +
//                "29384293847243 454353412 332423423 934923490 1\n" +
//                "900000000000000000 332423423 454353412 934923490 987654321";

        String s = "1\n" +
                "1 1 1 1 1";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));


        rl(); int T = nin();

        long time = System.currentTimeMillis();

        HashMap<Long, ArrayList<Long>> map = new HashMap<>();
        fill(1, new ArrayList<Long>(), map);

//        System.out.print("Time: " + (System.currentTimeMillis()-time));

        for (int t=0; t<T; ++t) {
            rl(); long N=nlo(), A=nlo(), B=nlo(), C=nlo(), D=nlo();

            long min = Long.MAX_VALUE;

            for (Map.Entry<Long, ArrayList<Long>> entry : map.entrySet()) {
                long v = entry.getKey();
                ArrayList<Long> list = entry.getValue();
                long price = D;
                if (N==1) {
                    min=price;
                }
                boolean contains2=false, contains3=false;
                for (long p:list) {
                    switch ((int)p) {
                        case 2: price += A; contains2=true; break;
                        case 3: price += B; contains3=true; break;
                        case 5: price += C; break;
                    }
                }
                long diff = Math.abs(N-v);
//                System.out.println(N+" " + v + " " + diff);
//                if (v==3_392_103_322_851_737_600L) {
//                    System.out.println(v);
//                }
                while (diff>0) {
                    if (diff==1) {
                        price += D;
                        diff -= 1;
                    } else if (diff == 2 && !contains2) {
                        price += (D*2);
                        diff -= 2;
                    } else if (diff == 3 && !contains2 && !contains3) {
                        price += (D*3);
                        diff -= 3;
                    } else if (diff == 4 && !contains2 && !contains3) {
                        price += (D*4);
                        diff -= 4;
                    } else {
                        long d = 1;
                        for (int i=list.size()-1; i>=0; --i) {
                            if (d*list.get(i)<=diff && d*list.get(i)>1) {
                                d*=list.get(i);
                            }
                        }
                        long dk = diff/d;
                        price += (D*dk);
                        diff -= (d*dk);
                    }
                }
                if (price>1) min = Math.min(min, price);
            }

            bw.write(Long.toString(min));
            bw.newLine();
        }
        bw.flush();

    }

    static void fill(long value, ArrayList<Long> list, HashMap<Long, ArrayList<Long>> map) {
        long _value = value * 2;
        if (_value <= 5_000_000_000_000_000_000L && _value > 0 && !map.containsKey(_value)) {
            ArrayList<Long> _list = new ArrayList<>(list);
            _list.add(2L);
            map.put(_value, _list);
            fill(_value, _list, map);
        }
        _value = value * 3;
        if (_value <= 5_000_000_000_000_000_000L && _value > 0 && !map.containsKey(_value)) {
            ArrayList<Long> _list = new ArrayList<>(list);
            _list.add(3L);
            map.put(_value, _list);
            fill(_value, _list, map);
        }
        _value = value * 5;
        if (_value <= 5_000_000_000_000_000_000L && _value > 0 && !map.containsKey(_value)) {
            ArrayList<Long> _list = new ArrayList<>(list);
            _list.add(5L);
            map.put(_value, _list);
            fill(_value, _list, map);
        }
    }

    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static void rl() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    static long nlo(){
        return Long.parseLong(st.nextToken());
    }
    static int nin(){
        return Integer.parseInt(st.nextToken());
    }
    /*private static void te(){
      }*/
    static double ndo(){
        return Double.parseDouble(st.nextToken());
    }
    static char[] nca(){
        return st.nextToken().toCharArray();
    }
    static String nstr(){
        return st.nextToken();
    }
}