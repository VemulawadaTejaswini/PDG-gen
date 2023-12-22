import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] ch=sc.next().toCharArray();
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<12;i++){
      if(i==3){
        sb.append(ch[i]+" ");
      }else{
        sb.append(ch[i]);
      }
    }
    System.out.println(sb);
  }
}
