import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        boolean[][] b = new boolean[4][13];
        String[] s = {"S", "H", "C", "D"};
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            String[] strArr = (br.readLine()).split(" ");
            int rank = Integer.parseInt(strArr[1]);
            if("S".equals(strArr[0]))
            {
                b[0][rank - 1] = true;
            }
            else if("H".equals(strArr[0]))
            {
                b[1][rank - 1] = true;
            }
            else if("C".equals(strArr[0]))
            {
                b[2][rank - 1] = true;
            }
            else if("D".equals(strArr[0]))
            {
                b[3][rank - 1] = true;
            }
        }
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 13; j++)
            {
                if(true != b[i][j])
                {
                    System.out.println(s[i] + " " + (j + 1));
                }
            }
        }
    }
}