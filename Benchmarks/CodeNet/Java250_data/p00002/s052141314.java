import java.io.*;
class Main{
  public static void main(String[] args) {
    try{
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String[] str = br.readLine().split("\\s");
        if(str == null) throw new Exception();
        int a = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        String b = "" + a;
        System.out.println(b.length());
      }
    }catch(Exception e){}
  }
}