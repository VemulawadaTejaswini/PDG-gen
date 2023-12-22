import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();

        String[] strarr = str.split(" ");

        int x = Integer.parseInt(strarr[0]);
        int y = Integer.parseInt(strarr[1]);
        
        if(x < y)
        {
            System.out.println("a < b");
        }
        else if(x > y)
        {
            System.out.println("a > b");
        }
        else
        {
            System.out.println("a == b");
        }
    }
}