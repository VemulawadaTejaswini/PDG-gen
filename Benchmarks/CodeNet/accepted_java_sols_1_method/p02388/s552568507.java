import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int line = Integer.parseInt(br.readLine());
            
            if(line >= 1 && line <= 100){
	            line = line * line * line ;
	            System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}