import java.io.*;
 
class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                int W, H, x, y, r;
 
                String line = reader.readLine();
                String[] strAry = line.split(" ");
 
                W = Integer.parseInt(strAry[0]);
                H = Integer.parseInt(strAry[1]);
                x = Integer.parseInt(strAry[2]);
                y = Integer.parseInt(strAry[3]);
                r = Integer.parseInt(strAry[4]);
 
                if((x + r) <= W && (y + r) <= H && (x - r) >= 0 && (y - r) >= 0 ){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
 
                 
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}