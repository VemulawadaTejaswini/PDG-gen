import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> st = new ArrayList<String>();
        String num;

        while(true){
            num = in.readLine();
            if(num.equals("0")) break;
            st.add(num);
        }

        int i=1;
        for(String a: st){
            System.out.println("Case " + i + ": " + a);
            i++;
        }
    }
}