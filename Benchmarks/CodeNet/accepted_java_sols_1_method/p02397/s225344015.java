import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		while(true){
			String str = in.readLine();
      String[] words = str.split("\\s");
			int[] data = new int[words.length];
      for(int i=0; i < words.length; i++){
        data[i] = Integer.parseInt(words[i]);
      }
			int x = data[0];
			int y = data[1];
			if( x == 0 && y == 0){
				break;
			}else if( x < y ){
				out.append(x).append(" ").append(y).append("\n");
			}else {
				out.append(y).append(" ").append(x).append("\n");
			}
		}
		System.out.print(out);
	}
}