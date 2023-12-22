import java.util.Queue;
import java.util.*;

public class Main {
     public static void main(String[] wjy){
            Scanner in = new Scanner(System.in);
            Queue<String[]> input = new ArrayDeque<String[]>();
            int num = Integer.parseInt(in.next()) ;
            int quan = Integer.parseInt(in.next());
            for (int i=0;i<num;i++) {
                String[] a = new String[2];
                a[0] = in.next();
                a[1] = in.next();
                input.add(a);
            }
            in.close();
            int calculate = 0;
            while (!input.isEmpty()){
                 String[] k = input.remove();
                 String name =(String) k[0];
                 int time =Integer.parseInt(k[1]);
                 if (time<=quan){
                    calculate=calculate+time;
                    System.out.println(name +" "+calculate);
                 }
                 else{
                    k[1]=Integer.toString((time-quan));
                    input.offer(k);
                    calculate=calculate+quan;
                 }
            }
     }
}

