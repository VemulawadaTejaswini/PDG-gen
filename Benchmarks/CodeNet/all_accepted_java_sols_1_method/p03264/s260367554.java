import java.io.*;
class Main {
 public static void main(String[] args) throws IOException{
	try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ){
		final int target = Integer.parseInt( br.readLine() );
        int result = (target%2 == 0) ? target*target/4 : (target/2+1)*(target/2);
		System.out.println(result);
	}
 }
}