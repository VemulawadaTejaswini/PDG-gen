import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//
        String s=read.readLine();
        String ss[]=s.split(" ");
        int n=Integer.parseInt(ss[0]);
        int d=Integer.parseInt(ss[1]);
        int c=0;
        for(int i=0;i<n;i++){
            String co=read.readLine();
            String ss2[]=co.split(" ");
            int x=Integer.parseInt(ss2[0]);
            int y=Integer.parseInt(ss2[1]);
            double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if(dist<=d){
                c++;
            }
        }
        System.out.println(c);

    }

}
