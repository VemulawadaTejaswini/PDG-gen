import java.io.*;
public class Main{
public static void main(String[] args){
//  int t = Integer.parseInt(args[0]);
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String str = null;
try{
  str = br.readLine();
  br.close();
} catch (IOException e){
  e.printStackTrace();
}
  int t = Integer.parseInt(str);
  System.out.println(t*t*t);
}

}

