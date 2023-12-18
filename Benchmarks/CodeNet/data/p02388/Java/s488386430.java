import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????

            String line; // ??\???????????????????????\???
            while ((line = br.readLine()) != null) {
                double ans = Math.pow(Integer.parseInt(line), 3);
                processLine(ans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processLine(double ans) {
        String crlf = System.getProperty("line.separator");
        System.out.println(ans + crlf);
    }
}