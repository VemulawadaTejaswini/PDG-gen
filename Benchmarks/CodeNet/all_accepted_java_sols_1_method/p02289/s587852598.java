
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int MAX = 500000;
    public static long a[] = new long[MAX + 1];

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Long> PQ = new PriorityQueue<Long>(Collections.reverseOrder());

        while (true) {
            String S = sc.next();
            if(S.equals("insert")) {
                long m = sc.nextLong();
                PQ.add(m);
            }
            if(S.equals("extract")) {
                System.out.println(PQ.poll());
            }
            if(S.equals("end")) break;
        }

        //??????
    }

}