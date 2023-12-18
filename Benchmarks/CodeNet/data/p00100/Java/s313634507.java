
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int overCount = 0, count, n, empID, price, quantitiy;
        long total;

        Queue<Integer> iQueue = new LinkedList<Integer>();

        long[] emp = new long[4000];

        while ( (count = Integer.parseInt(bReader.readLine())) != 0 )
        {
            n = 0;
            while ( n < count )
            {
                String str = bReader.readLine();
                String[] editedstr = str.split(" ");

                empID = Integer.parseInt(editedstr[0]);         //社員番号
                price = Integer.parseInt(editedstr[1]);         //単価
                quantitiy = Integer.parseInt(editedstr[2]);     //販売個数
                total = price * quantitiy;                      //実績

                if ( emp[empID] == 0 )                          //初めての入力
                {
                    emp[empID] = total;
                    iQueue.offer(empID);
                }
                else if ( emp[empID] <= 1000000 )               //2回目以降の入力かつ100万を超えない値の場合
                {
                    emp[empID] += total;
                }
                else
                {
                }

                n++;

            }

            for ( int a : iQueue )
            {
                if(emp[a] >= 1000000)
                {
                    System.out.println(a);
                    overCount++;
                }
            }

            if ( overCount == 0 )
            {
                System.out.println("NA");
            }
            overCount = 0;
            
            emp = new long[4000];
        }
    }
}