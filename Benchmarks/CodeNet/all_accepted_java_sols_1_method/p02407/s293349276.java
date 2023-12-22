import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String str = br.readLine();
        String[] strArr = (br.readLine()).split(" ");
        
        for(int i = strArr.length - 1; i >= 0; i--)
        {
            if(0 != i)
            {
                System.out.print(strArr[i] + " ");
            }
            else
            {
                System.out.print(strArr[i]);
            }
        }
        System.out.println();
    }
}