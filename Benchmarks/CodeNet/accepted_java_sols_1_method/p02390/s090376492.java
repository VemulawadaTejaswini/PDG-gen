import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int h=num/3600;
        num-=(h*3600);
        int m=num/60;
        num-=(m*60);
        System.out.println(h+":"+m+":"+num);
    }
}