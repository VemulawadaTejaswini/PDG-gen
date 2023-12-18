import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
    InputStreamReader br = new InputStreamReader(System.in);	
    BufferedReader is = new BufferedReader(br);
    String str = is.readLine();
    int x = Integer.parseInt(str);
    int h,m,s;
    h=x/3600;
    x=x%3600;
    m=x/60;
    s=x%60;
    System.out.println(h + ":" +  m + ":" + s);
    }
}