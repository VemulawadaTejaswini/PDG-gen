import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String line = br.readLine();
            StringBuffer stringBuffer = new StringBuffer(line);
            line = stringBuffer.reverse().toString();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}