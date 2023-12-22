import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String str = sc.nextLine();
    int min = line.length();
    for(int i = 0;i <= line.length() - str.length();i++){
      int temp = 0;
      for(int j = 0;j < str.length();j++){
        if(!String.valueOf(line.charAt(i + j)).equals(String.valueOf(str.charAt(j)))){
          temp++;
        }
      }
      if(temp < min){
        min = temp;
      }
    }
    System.out.println(min);
  }
}