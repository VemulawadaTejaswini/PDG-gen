import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String lines[]=line.split(" ",0);
        
        int W=Integer.parseInt(lines[0]);
        int H=Integer.parseInt(lines[1]);
        int x=Integer.parseInt(lines[2]);
        int y=Integer.parseInt(lines[3]);
        int r=Integer.parseInt(lines[4]);
        String ans="Yes";
        
        if(x-r<0||y-r<0||x+r>W||y+r>H){
           ans="No"; 
        }
        System.out.println(ans);
    }
}