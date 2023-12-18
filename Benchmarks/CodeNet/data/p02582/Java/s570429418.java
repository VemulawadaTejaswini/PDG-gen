import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String data = scan.next();
    int max=0, i=0;
    for(int j=0;j<3;j++){
     if(data.charAt(j)=='R')i++;
     else i=0;
     if(i>max)max=i;
    }
    System.out.println(""+max);
  }
  
}