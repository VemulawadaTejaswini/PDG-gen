import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    sc.close();
    String predict[]=new String[3];
    String real[]=new String[3];
    int cnt=0;
    for(int i=0;i<3;i++){
      predict[i]=s.substring(i,i+1);
      real[i]=t.substring(i,i+1);
      if(predict[i].equals(real[i])){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}