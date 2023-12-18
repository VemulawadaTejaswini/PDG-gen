import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        line();
        int i ;
        var a = lineInts();
        var result = new ArrayList<Integer>();
        Map<Integer,Integer> b = new HashMap<>();
        for(i = 0;i<a.length;i++){
            if(!b.containsKey(a[i])){
                b.put(a[i],1);
            }else{
                b.put(a[i],b.get(a[i])+1);
            }
        }

        int c = lineInts()[0];
        int sum = 0;
        int[] d;
        for(i=0;i<c;i++){
            d = lineInts();

            if(b.get(d[0]) != null) {
                if (b.get(d[1]) == null && b.get(d[0]) != null) {
                    b.put(d[1], b.get(d[0]));
                    b.remove(d[0]);
                } else {
                    b.put(d[1], b.get(d[1]) + b.get(d[0]));
                    b.remove(d[0]);
                }
            }
            for (Integer k : b.keySet()) {
                sum += (k * b.get(k));
            }

            result.add(sum);
            sum = 0;
        }


        for(Integer s : result){
            puts(s);
        }
        scan.close();
    }

    public static String line(){
        return scan.nextLine();
    }

    public static int[] lineInts(){
        String l = line();
        String[] l1 = l.split(" ");
        int[] a = new int[l1.length];
        for(int i = 0; i < l1.length; i++){
            a[i] = Integer.parseInt(l1[i]);
        }
        return a;
    }

    public static int[] split_piriod_Ints(String[] a){
        String l = line();
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = Integer.parseInt(a[i]);
        }
        return b;
    }

    public static long[] lineLongs(){
        String l = line();
        String[] l1 = l.split(" ");
        long[] a = new long[l1.length];
        for(int i = 0; i < l1.length; i++){
            a[i] = Long.parseLong(l1[i]);
        }
        return a;
    }

    public static void puts(Object a){
        System.out.println(a);
    }

    public static void puts(Object... a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
