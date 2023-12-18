import java.io.*;
import java.util.Arrays;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringBuilder sb = new StringBuilder();
        int[][][] room = new int[4][3][10];
        
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String[] strArr = (br.readLine()).split(" ");
            int b = Integer.parseInt(strArr[0]);
            int f = Integer.parseInt(strArr[1]);
            int r = Integer.parseInt(strArr[2]);
            int v = Integer.parseInt(strArr[3]);
            
            room[b-1][f-1][r-1] += v;
        }
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                for(int k = 0; k < 10; k++)
                {
                    sb.append(" ").append(room[i][j][k]);
                }
                sb.append("\n");
            }
            if(i != 3)
            {
                sb.append("####################\n");
            }
        }
        System.out.print(sb);
    }
}