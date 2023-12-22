import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str_array = in.readLine().split(" ");
    int a = Integer.parseInt(str_array[0]);
    int b = Integer.parseInt(str_array[1]);
    if(a>b){
      for(int i=0;i<a;i++){
        System.out.print(b);
      }
    }else{
      for(int i=0;i<b;i++){
        System.out.print(a);
      }
    }
  }
}