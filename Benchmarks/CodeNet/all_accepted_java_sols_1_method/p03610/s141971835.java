import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int oddC =0;
    if(S.length()%2==0){
      oddC=S.length()/2;
    }else{
      oddC=S.length()/2+1;
    }
      
    String odd[] = new String[oddC];
    for(int i=0;i<oddC;i++){
      odd[i]=S.substring(2*i,2*i+1);
    }
    for(int i=0;i<oddC;i++){
      System.out.print(odd[i]);
    }
  }
  

  
}