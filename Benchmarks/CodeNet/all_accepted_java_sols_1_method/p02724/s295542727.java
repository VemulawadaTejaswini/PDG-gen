import java.io.*;
class Main{
  public static void main(String []args)throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    
    int happiness;
    
    happiness = (num / 500) * 1000;
    num = num % 500;
    happiness = happiness + (num / 5) * 5;
    
    System.out.println(happiness);
  }
}