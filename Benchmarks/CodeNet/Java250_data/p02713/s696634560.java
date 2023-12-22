import java.io.*;

class Calc{
    public static int gcd(int a, int b, int c)  {
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        while (c > 0) {
            r = a % c;
            a = c;
            c = r;
        }
        return a;
    }
}

class Main{

    public static void main(String args[])
    {
        String buf;
        int num;
        int ans;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            buf = br.readLine();
            num = Integer.parseInt(buf);
            ans = 0;
            for(int i = 1; i <= num; i++){
                for(int j = 1; j <= num; j++){
                    for(int k = 1; k <= num; k++){    
                        ans += Calc.gcd(i,j,k);
                    }
                }
            }
            
            System.out.println(Integer.toString(ans));
        } catch(Exception e) {}
  }
}