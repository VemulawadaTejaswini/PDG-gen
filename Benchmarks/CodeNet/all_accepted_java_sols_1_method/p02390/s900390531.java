import java.io.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int t = Integer.parseInt(str);
         int h = t/3600;
          int m = (t%3600)/60;
           int s = (t%3600)%60;
         System.out.println(h + ":" + m + ":" + s);       
 }
}
        