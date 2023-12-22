import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String data[] = line.split("");
    int sum = 0;
    for(int i = 0;i < data.length;i++){
      int num = Integer.parseInt(data[i]);
      sum += num;
    }
    if(sum % 9 == 0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}