import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
        	int i = 1;
        	while(i < 10002){
        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            	String line = br.readLine();
            	if(line.equals("0")){
            		break;
            	}
        		int num = Integer.parseInt(line);
            	System.out.println("Case " + i + ": " + num);
            	i++;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}