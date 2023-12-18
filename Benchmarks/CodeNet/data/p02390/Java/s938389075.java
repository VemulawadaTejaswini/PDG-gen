import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int total_second = Integer.parseInt(br.readLine());
    int second = total_second % 60;
    int minute = total_second / 60 % 60;
    int hour = total_second / 60 / 60 ;
    System.out.println(hour + ";" + minute + ";" + second);
  }
}

