import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long a, v, b, w, t;

        a = sc.nextLong();
        v = sc.nextLong();
        b = sc.nextLong();
        w = sc.nextLong();
        t = sc.nextLong();
        sb.append(a);
        sb.append(v);
        sb.append(b);
        sb.append(w);
        sb.append(t);

        long min = (long) Math.pow(-10, 9);
        long max = (long) Math.pow(10, 9);
        
        
        try {
            if(a <  min || a > max || b <  min || b > max)
                throw new Exception("aまたはbが不正です。");
            if(v <  1 || w > max)
                throw new Exception("vまたはwが不正です。");
            if(t < 1 || t > max)
                throw new Exception("tが不正です。");
            if(a == b)
                throw new Exception("aとbが同値です。");
            if(!sb.toString().matches("^(0|[-]?[1-9][0-9]*)$"))
                throw new Exception("整数以外です。");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            System.exit(0);
        }


        for(int i = 0; i < t; i++){
            a = a + v;
            b = b + w;
            if(a == b) break;
        }

        if(a == b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}