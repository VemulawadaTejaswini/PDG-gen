import java.io.*;
 
class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        int a[] = new int[2];

        a[0] = Integer.parseInt(strarr[0]);
        a[1] = Integer.parseInt(strarr[1]);
        
        int ans[] = new int[2];
        ans[0] = a[0]*a[1];
        ans[1] = a[0]+a[1]+a[0]+a[1];
        
        System.out.println(ans[0] + " " + ans[1]);
    }
}