import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
        	for(int i = 1; i < 10001; i++){
        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            	String line = br.readLine();
            	if(line == null){
            		break;
            	}
        		int num = Integer.parseInt(line);
            	System.out.println("Case " + i + ": " + num);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}