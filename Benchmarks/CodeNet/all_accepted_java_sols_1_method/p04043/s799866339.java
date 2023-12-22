import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    Scanner sc =new Scanner(System.in);
    
    int read;
    int five=0,seven=0;
    for(int i=0;i<3;i++){
            read = sc.nextInt();
      if(read==5){
        five++;
      }
      else if(read==7){
        seven++;
      }
    }
    String ans ="NO";
    if(five==2||seven==1){
      ans="YES";
    }
    
    System.out.println(ans);
  }
}