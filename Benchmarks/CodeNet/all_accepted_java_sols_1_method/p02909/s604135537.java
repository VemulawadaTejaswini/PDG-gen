import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] weather = new String[]{"Sunny","Cloudy","Rainy"};
    String tw = sc.next();
    for(int i=0;i<weather.length;++i){
      if(tw.equals(weather[i])){
        System.out.println(weather[(i+1)%3]);
        break;
      }
    }
  }
}