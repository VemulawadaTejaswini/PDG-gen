
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bReader =
                       new BufferedReader(new InputStreamReader(System.in));
        int datanum;


        //datanumに代入し、datanum != 0が真か偽か判定
        while ( (datanum = Integer.parseInt(bReader.readLine())) != 0 )
        {
            //----------datanumが0でない時の処理-----------

            String[][] dataSet = new String[datanum][datanum];
            String inputStr;

            for ( int x = 0; x < datanum; x++ )
            {
                //データセットのi行目を入力
                inputStr = bReader.readLine();
                dataSet[x] = inputStr.split(" ");
            }

            //表示部
            for ( int x = 0; x < datanum; x++ )
            {
                int rmul = 0;
                for ( int y = 0; y < datanum; y++ )
                {
                    int output = Integer.parseInt(dataSet[x][y]);
                    rmul += output;
                    System.out.printf("%5d", output);
                }

                System.out.printf("%5d", rmul);
                if ( x == datanum - 1 )
                {
                    int cmulsum = 0;
                    System.out.println();
                    for ( int i = 0; i < datanum; i++ )
                    {
                        int cmul = 0;
                        for ( int j = 0; j < datanum; j++ )
                        {
                            cmul += Integer.parseInt(dataSet[j][i]);
                        }
                        System.out.printf("%5d", cmul);
                        cmulsum += cmul;
                        cmul = 0;
                    }
                    System.out.printf("%5d", cmulsum);
                }

                System.out.println();
            }
        }
    }
}