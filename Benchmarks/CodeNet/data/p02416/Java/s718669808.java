import java.io.*;
public class Main{
  public static void main(String[]args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
    String line;
    int sum;
    while(true){
      sum = 0;
      line = reader.readLine();
      if(line.equals("0"))
      break;
      String[] x = line.split("");
      int[] y = new int[x.length];
      for(int i=0;i<x.length;i++){
        y[i]=Integer.parseInt(x[i]);
        sum += y[i];
      }
      System.out.printf("%d\n",sum);
}
}catch(IOException e){
  System.out.println(e);
} catch(NumberFormatException e){
  System.out.println("数字が正しくありません");
}
}
}
