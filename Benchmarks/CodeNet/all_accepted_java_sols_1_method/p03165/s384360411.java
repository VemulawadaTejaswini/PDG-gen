import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String s = in.next();
        String t = in.next();
        int [][]arr = new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)) arr[i+1][j+1] =arr[i][j]+1;
                else arr[i+1][j+1]= Math.max(arr[i][j+1],arr[i+1][j]);
            }
        }
        int i = s.length();int j = t.length();
        String text = "";
        int cur = arr[s.length()][t.length()];
        while (cur>0){
            if (arr[i-1][j]==cur){
                i--;
            }
            else if(arr[i][j-1]==cur){
                j--;
            }
            else {
                text= t.charAt(j-1)+text;
                i--;
                j--;
                cur--;
            }
        }
        System.out.println(text);
    }
}
