import java.util.*;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String S = sc.next();
        String[] splitS = S.split("", 0);
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        byte[] bytes = new byte[4];
        
        try{
            for(int i = 0; i < splitS.length; i++){
                bytes = splitS[i].getBytes("UTF-16");
                bytes[3] += N;
                if(bytes[3] > 90){
                    bytes[3] -= 26;
                }
                 String newStr = new String(bytes, "UTF-16");
                 System.out.print(newStr);
            }
        
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}