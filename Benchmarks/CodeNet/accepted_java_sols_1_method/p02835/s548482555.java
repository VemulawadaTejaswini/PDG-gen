    import java.io.*;
    public class Main{
      public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = reader.readLine().split(" ");
        int sum = 0;
        for(String s:list){
          sum+= Integer.parseInt(s);}
        if(sum>=22){
          System.out.println("bust");
        }
        else{
          System.out.println("win");}
      }}