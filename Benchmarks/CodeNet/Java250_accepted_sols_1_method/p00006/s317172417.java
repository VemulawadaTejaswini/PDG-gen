import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder(buf.readLine());
        st.reverse();

        System.out.println(st.toString());


    }
}