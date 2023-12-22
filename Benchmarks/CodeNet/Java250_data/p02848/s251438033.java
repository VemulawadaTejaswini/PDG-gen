import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
	char[] chars = br.readLine().toCharArray();
    
    for(char c : chars) {
      c += num;
      if(c > 'Z') c -= 26;
	    System.out.print(c);
    }
  }
}