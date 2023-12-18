import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            
            System.out.println("Case i: "+line);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}