import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class Main {
    public static void main(String args[])throws Exception{
        /*
         * x - r が0 より小さい、または、x + r がW より大きいならばNoと判定。
         * x - r が0 以上、かつ、x + r がW 以下ならばYesと判定。
         */
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = br.readLine();
                //文字列に先頭又は最後に空白文字がくっ付いている場合、それらを全て取り除きます。
                line = line.trim();
                //半角スペースを区切り文字として扱う
                String[] readLineArray = line.split("[\\s+]");
 
                int W,H,x,y,r;
                W = Integer.parseInt(readLineArray[0]);
                H = Integer.parseInt(readLineArray[1]);
                x = Integer.parseInt(readLineArray[2]);
                y = Integer.parseInt(readLineArray[3]);
                r = Integer.parseInt(readLineArray[4]);
 
                if( (x - r) >= 0 && (x + r) <= W && (y - r) >= 0 && (y + r) <= H ){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
    }
}