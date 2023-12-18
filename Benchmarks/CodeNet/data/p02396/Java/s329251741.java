import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            
            int x = Integer.parseInt(line);
            int i = 0;
            while(line != null){
            	if(x==0){
            		break;
            	}
            	System.out.println("Case "+i+": "+ x);
            	i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}