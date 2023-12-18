import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        int overCount = 0;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        int n, count;
        int[] emp;

        emp = new int[4001];

        clearAry(emp);

        while ( (count = strRead()) != 0 )
            {
                n = 0;

                while ( n < count )
                    {
                        String str = bReader.readLine();
                        String[] strEd = str.split(" ");

                        int empCnt = Integer.parseInt(strEd[0]);
                        int emp_price = Integer.parseInt(strEd[1]);
                        int emp_q = Integer.parseInt(strEd[2]);

                        emp[empCnt] = emp[empCnt] + emp_price * emp_q;
                        n++;
                    }
                for ( int i = 0; i < 4000; i++ )
                    {
                        if ( emp[i] >= 1000000 )
                            {
                                System.out.println(i);
                                overCount++;
                            }
                    }

                if ( overCount == 0 )
                    {
                        System.out.println("NA");
                    }
                overCount = 0;
                clearAry(emp);
            }

    }

    public static int strRead()
    {

        BufferedReader br_dataCount = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br_dataCount.readLine());
    }

    public static void clearAry(int[] ar)
    {
        for ( int i = 0; i <= 4000; i++ )
            {
                ar[i] = 0;
            }
    }
}