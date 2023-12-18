
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        long d=Long.parseLong(s[1].trim());
        long r=(d*d);
        long res=0;

        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            long x=Long.parseLong(s[0].trim());
            long y=Long.parseLong(s[1].trim());
            if(is_path(x,y,r)){
                res++;
            }

        }
System.out.println(res);
//        int t = Integer.parseInt(br.readLine().trim());

    }

    public static boolean is_path(long x,long y,long d){
        long r=(x*x)+(y*y);
//        r=Math.sqrt(r);
        if(r<=d){
            return true;
        }
        return false;
    }



}
