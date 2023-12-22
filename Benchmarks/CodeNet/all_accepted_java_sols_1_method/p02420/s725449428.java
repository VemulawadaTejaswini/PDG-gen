import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m;
    int h;
    String s;
    String card;
    String card2;
    while(true){
      card=sc.next();
      if(card.startsWith("-")) break;
      m=sc.nextInt();
      for(int i=0;i<m;i++){
        h=sc.nextInt();
        card2=card.substring(0,h);
        card=card.substring(h);
        card=card+card2;
      }
      System.out.println(card);
    }
  }
}

