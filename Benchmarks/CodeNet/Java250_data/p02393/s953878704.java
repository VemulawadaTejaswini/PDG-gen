import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //文字列に先頭又は最後に空白文字がくっ付いている場合、それらを全て取り除きます。
        line = line.trim();
        //半角スペースを区切り文字として扱う
        String[] readLineArray = line.split("[\\s+]");

        int[] threeNum  = new int[3];
        threeNum[0] = Integer.parseInt(readLineArray[0]);
        threeNum[1] = Integer.parseInt(readLineArray[1]);
        threeNum[2] = Integer.parseInt(readLineArray[2]);

        Arrays.sort(threeNum);

        System.out.println(threeNum[0]+" "+threeNum[1]+" "+threeNum[2]);
    }
}