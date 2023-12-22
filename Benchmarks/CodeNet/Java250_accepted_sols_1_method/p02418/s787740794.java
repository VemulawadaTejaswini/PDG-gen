import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String p=br.readLine();
        s=s+s;
        if(s.indexOf(p)!=-1){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}