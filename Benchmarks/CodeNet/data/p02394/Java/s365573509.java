import java.io.*;

class Main{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader re =
         new BufferedReader(new InputStreamReader(System.in), 1);
          
        String line = re.readLine();    
        String[] w = line.split(" ",0);
        
        int W = Integer.parseInt(w[0]);
        int H = Integer.parseInt(w[1]);
        int x = Integer.parseInt(w[2]);
        int y = Integer.parseInt(w[3]);
        int r = Integer.parseInt(w[4]);
        
        String ret = "No";
        if(-100 <=x && x<=100 && -100 <=y && y<=100 && 0<W && W <=100 && 0<H && H <=100 && 0<r && r <=100){
        if (W>= (x+r) &&H>=(y+r)&& (x-r) >= 0 && (y-r) >= 0) ret = "YES";  
        }  
        
        System.out.println(ret);
        re.close();
    }
}