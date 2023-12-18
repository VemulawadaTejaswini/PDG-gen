import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    sc.close();
    String str[]=new String[s.length()];
    boolean isDifferent=true;
    for(int i=0;i<s.length();i++){
      str[i]=s.substring(i,i+1);
    }
    Arrays.sort(str);
    for(int i=0;i<str.length-1;i++){
      if(str[i].equals(str[i+1])){
        isDifferent=false;
        break;
      }
    }
    if(isDifferent){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}