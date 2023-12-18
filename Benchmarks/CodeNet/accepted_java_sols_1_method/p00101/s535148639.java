import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException{
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

            for (int i=0;i<n;i++){
                System.out.println(bf.readLine().replaceAll("Hoshino","Hoshina"));
            }
    }
}