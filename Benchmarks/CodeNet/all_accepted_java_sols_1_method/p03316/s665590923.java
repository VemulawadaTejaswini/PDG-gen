import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    int value = Integer.parseInt(str);
    int digitSum = 0;
    for(int i = 0; i < str.length(); i++) {
      digitSum += (str.charAt(i) - '0');
    }
    
    if(value % digitSum == 0) {
	    System.out.println("Yes");
    }
    else {
	    System.out.println("No");
    }
  }
}
