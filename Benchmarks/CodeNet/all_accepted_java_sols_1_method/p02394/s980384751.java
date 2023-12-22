import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int W = Integer.parseInt(str[0]);
        int H = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);
        int r = Integer.parseInt(str[4]);
        
        if((x-r>=0) && (y-r>=0) && (y+r<=H) && (x+r<=W)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}