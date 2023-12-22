import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i;
        int[] n = new int[990];
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        str = in.readLine();
        char[] c = str.toCharArray();
        for(i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                c[i] = Character.toLowerCase(c[i]);
            }
            else if(Character.isLowerCase(c[i])){
                c[i] = Character.toUpperCase(c[i]);
            }
        }
        System.out.println(c);   
        System.out.flush();
    }
}