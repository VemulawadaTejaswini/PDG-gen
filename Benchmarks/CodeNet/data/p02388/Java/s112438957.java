import java.io.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????

        String inStr = br.readLine();        // ??????????????\???
        int a = Integer.parseInt(inStr);    // ??´??°?????????
                
        int x = Power(a, 3);
        
        System.out.print(x);
    }

    static private int Power(int a, int n){
        int f = a;
    
        if(n == 0){
            return 1;
        }

        for(int i=n; i>1; i--){
            f *= f;
        }
        
        return f;
    }

}
    