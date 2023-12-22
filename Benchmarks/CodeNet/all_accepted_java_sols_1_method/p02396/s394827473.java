import java.io.*;  

public class Main {
    public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i=0;
    int y = 1;
    String buf = br.readLine();
    //String[] x = buf.split("",0);
    int z = Integer.parseInt(buf);
    while(z!=0){
    	
       	System.out.println("Case "+ y + ": "  + z);
    	buf = br.readLine();
    	z = Integer.parseInt(buf);
    	y++;
    }
  }
    
}