import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    HashSet<String> dic=new HashSet<String>();
    for(int i=0;i<num;i++){
      String order=sc.next();
      String word=sc.next();
      switch(order){
        case ("insert"):
          dic.add(word);
          break;
        case ("find"):
          if(dic.contains(word)) System.out.println("yes");
          else System.out.println("no");
          break;
      }
    }
  }
}

