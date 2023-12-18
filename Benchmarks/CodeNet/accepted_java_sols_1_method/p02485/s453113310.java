import java.io.*;
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        for(int i=0;;i++){
            int x=0;
            String str= input.readLine();
            if(str.equals("0"))
        	break;
            for(int j=0;j<str.length();j++){
                x+= str.charAt(j) - '0';
            }
            System.out.println(x);
        }
    }
}