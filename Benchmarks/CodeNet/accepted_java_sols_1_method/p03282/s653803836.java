import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String k=sc.nextLine();
      String s[]=line.split("",0);
      int i=0;
      boolean b=false;
      while(s[i].equals("1")){
        if((i+1+"").equals(k)){
        	b=true;
          break;
        }
      	i++;
      }
      int n=Integer.parseInt(s[i]);
      if(b)System.out.println(1);
      else
        System.out.println(n);
    }
}