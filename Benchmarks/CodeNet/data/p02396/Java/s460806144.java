import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            int index = 1;
            while((line = br.readLine()) != null){
                if(line.equals("0")){
                	break;
                }
                System.out.println("Case " + index + ": " + line);
                ++index;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}