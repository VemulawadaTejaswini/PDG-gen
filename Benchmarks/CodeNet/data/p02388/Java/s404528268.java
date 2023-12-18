import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line; 
            while ((line = br.readLine()) != null) {
                double d_ans = Math.pow(Integer.parseInt(line), 3);
                String ans = String.valueOf(d_ans);
                processLine(ans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String ans) {
        String crlf = System.getProperty("line.separator");
        System.out.println(ans + crlf);
    }
}