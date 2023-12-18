import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine(); // ??\???????????????????????\???
            int i = line.length();
            	while(i > 0){
            		if(i == 0){
            		System.out.print(line.substring(i-1, i));
            		i--;
            		}
            		System.out.print(line.substring(i-1, i));
            		i--;
            	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}