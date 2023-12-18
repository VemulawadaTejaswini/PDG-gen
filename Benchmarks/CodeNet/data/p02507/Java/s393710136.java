import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    String s = br.readLine();
	    if(s.equals("END OF INPUT")) break;

	    String tmp[] = s.split(" ");
	    for(int i=0;i<tmp.length;i++){
		System.out.print(tmp[i].length());
	    }
	    System.out.println("");
        }
    }
}