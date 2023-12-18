import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        int a[] = new int[2];

        int a[0] = Integer.parseInt(strarr[0]);
        int a[1] = Integer.parseInt(strarr[1]);
        
        System.out.println(a[0]*a[1]);
    }
}