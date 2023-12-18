import java.util.*;

public class Main{

  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    String temp = sc.next();
    char[] s = temp.toCharArray();
    for(int i=0;i<temp.length()/2;i++){
      if(s[i]!=s[temp.length()-i-1])sum++;
    }
    System.out.println(sum);
  }
}