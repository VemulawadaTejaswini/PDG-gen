import java.io.*;


public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    long H = Long.parseLong(in[0]);
    long W = Long.parseLong(in[1]);
    br.close();

    if(H == 1 || W == 1){
      System.out.println(1);
    }else{
      System.out.println((H * W + 1) / 2);
    }
  }
}
