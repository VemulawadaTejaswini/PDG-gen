import java.io.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String buf;
    while((buf = br.readLine())!=null){
      double d = Double.parseDouble(buf);
      d -= 48;
      int i =0;
      while(d <=48.0){
        d-=3;
        i++;
      }
      p(i);
    }
  }
    public static void p(int i){
      String l[] ={"light fly" , "fly" , "bantam" ,"feather","light","light welter","welter"
              ,"light middle","middle","light heavy","heavy"};
      
      System.out.println(l[i]);
    }
}