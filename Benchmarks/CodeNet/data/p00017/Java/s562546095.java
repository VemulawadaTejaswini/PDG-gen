import java.io.*;
import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(poor(s));
        }
    }

    static String poor(String str) {
        Pattern data = Pattern.compile("this|that|the");
        char[] c=str.toCharArray();
        int poor=0;
        while(!data.matcher(String.valueOf(c)).find()&&poor<=26){
            for(int i=0;i<c.length;i++){
                if('a'<=c[i]&&c[i]<='z'){
                    if(c[i]!='z') c[i]++;
                    else c[i]='a';
                }
            }
            poor++;
        }
        return String.valueOf(c);
    }
}