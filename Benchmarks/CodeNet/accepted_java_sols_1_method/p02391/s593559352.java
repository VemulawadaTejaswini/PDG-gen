import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line; // ??\???????????????????????\???
            while ((line = br.readLine()) != null) {
            	String[] list = line.split(" ", 0);
            	int a = Integer.parseInt(list[0]);
            	int b = Integer.parseInt(list[1]);
            	
            	if(a < b){
            		System.out.println("a < b");
            	}else if(a > b){
            		System.out.println("a > b");
            	}else if(a == b){
            		System.out.println("a == b");
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}