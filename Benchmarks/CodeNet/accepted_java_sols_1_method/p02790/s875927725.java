import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] split = input.split(" ");
    int a = Integer.parseInt(split[0]);
     int b = Integer.parseInt(split[1]);
    int x = 0;
    int y =0;
    if(a==b) {
      x=a;
      y=b;
    }
    else if(a>b) {
       x=a;
      y=b;
    } else {
      x=b;
      y=a;
    }
    int number =0;
    for(int i=1;i<=x;i++){
      number = number*10 + y;
    }
    System.out.println(number);
    
  }
}