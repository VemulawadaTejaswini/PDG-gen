import java.io.*;
class Main {
 public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
     String s = new String(br.readLine());
     String[] arg = s.split(" ");
     int width = Integer.parseInt(arg[0]) - 1;
     int length = Integer.parseInt(arg[1]) - 1;
     System.out.println(width*length);

 }
}