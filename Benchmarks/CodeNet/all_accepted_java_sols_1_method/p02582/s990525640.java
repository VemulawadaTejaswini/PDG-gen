import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String data[] = line.split("");
    int count = 0;
    int n = 0;
    int flag = 0;
    int max = 0;
    while(n < data.length){
      if(data[n].equals("R")){
        count++;
        if(max < count){
          max = count;
        }
      }
      else{
        count = 0;
      }
      n++;
    }
    System.out.println(max);
  }
}
      