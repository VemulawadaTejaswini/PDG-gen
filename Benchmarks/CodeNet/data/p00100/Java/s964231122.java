import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        int overCount = 0, empValue, n, empID, price, quantitiy;
        long total;
        long[] emp = new long[4001];

        Queue<Integer> iQueue = new LinkedList<Integer>();

        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        aryClear(emp);

        while ((empValue = Integer.parseInt(bReader.readLine())) != 0) {
            n = 0;
            overCount = 0;
            iQueue = new LinkedList<Integer>();
            aryClear(emp);

            while (n < empValue) {
                String str = bReader.readLine();
                String[] editedstr = str.split(" ");
                empID = Integer.parseInt(editedstr[0]);         //社員番号
                price = Integer.parseInt(editedstr[1]);         //単価
                quantitiy = Integer.parseInt(editedstr[2]);     //販売個数
                total = price * quantitiy;                      //実績

                if (emp[empID] == -1) {                         //初めての入力
                    emp[empID] = total;
                    iQueue.offer(empID);
                } else {
                    emp[empID] += total;
                }
                n++;
            }

            for (int a : iQueue) {
                if (emp[a] >= 1000000) {
                    System.out.println(a);
                    overCount++;
                }
            }
            if (overCount == 0) {
                System.out.println("NA");
            }
        }
    }

    public static void aryClear(long[] ary) {
        for (int i = 0; i <= 4000; i++) {
            ary[i] = -1;
        }
    }
}