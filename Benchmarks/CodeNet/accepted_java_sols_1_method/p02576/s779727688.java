import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine().trim());
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int x=Integer.parseInt(s[1].trim());
        int t=Integer.parseInt(s[2].trim());
        int ceil=(int)Math.ceil((float)n/x);
//        System.out.println(ceil);
        int res=ceil*t;
//        if(x==1){
//            res=n*t;
//        }
        System.out.println(res);





//        long[] a=new long[n];
//        long res=0;
//        for(int i=0;i<n;i++){
//            a[i]=Long.parseLong(s[i].trim());
//        }
//
//        long last=a[0];
//        for(int i=1;i<n;i++){
//            if(a[i]<last){
//                res+=(last-a[i]);
//            }
//            last=Math.max(last,a[i]);
//        }
//        System.out.println(res);





    }






}
