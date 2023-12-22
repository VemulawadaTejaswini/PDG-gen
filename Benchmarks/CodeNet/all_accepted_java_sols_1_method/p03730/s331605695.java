import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    
    int a = Integer.parseInt(data[0]);
    int b = Integer.parseInt(data[1]);
    int c = Integer.parseInt(data[2]);
    
    int i = 1;
    int init = a%b;
    while (true){
      if((a*i)%b == c){
        System.out.println("YES");
        return;
      }
      if(i>1 && (a*i)%b==init){
        System.out.println("NO");
        return;
      }
      i++;
    }
  }
}
