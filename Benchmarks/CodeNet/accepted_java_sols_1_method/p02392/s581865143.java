import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();

        String[] strarr = str.split(" ");
        int[] intarr = new int[3];

        for(int i=0; i<3; i++)
        {
            intarr[i] = Integer.parseInt(strarr[i]);
        }
        
        if(intarr[0] < intarr[1] && intarr[1] < intarr[2])
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}