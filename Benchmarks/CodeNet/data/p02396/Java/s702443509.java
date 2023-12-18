import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            StringBuilder stringBuilder = new StringBuilder();
            
            String line;
            int index = 1;
            while((line = br.readLine()) != null){
            	if(line.equals("0")) break;
            	stringBuilder.append("Case " + index + ": " + line + "\n");
            	++index;
            }
            System.out.print(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}