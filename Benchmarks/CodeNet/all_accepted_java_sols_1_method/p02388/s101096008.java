import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int num = Integer.parseInt(str);
	 int res = num*num*num;
	 System.out.println(res);    

    }
}