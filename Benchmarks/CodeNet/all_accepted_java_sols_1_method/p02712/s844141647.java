import java.io.*;

class Main
{
    public static void main(String args[])
    {
        String buf;
        int num;
        long ans;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            buf = br.readLine();
            num = Integer.parseInt(buf);
            ans = 0;
            for(int i = 1; i <= num; i++){
                if (i % 3 == 0 || i % 5 == 0){
                    continue;
                }else{
                    ans += i;
                }
            }
            System.out.println(Long.toString(ans));
        } catch(Exception e) {}
  }
}