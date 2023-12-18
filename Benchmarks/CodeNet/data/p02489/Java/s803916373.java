import java.io.*;
public class Main {
    public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int i = 0;
      try{
      for(;;){
        i++;
        String buf = reader.readLine();
        int num = Integer.parseInt(buf);
        if(num == 0){
          break;
        }else{
          System.out.println("Case "+i+": "+num);
        }
      }
    }catch(IOException e){
        System.out.println(e);
      }
    }
}