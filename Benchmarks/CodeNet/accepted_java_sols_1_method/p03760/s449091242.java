import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] o=sc.next().toCharArray(),e=sc.next().toCharArray();
    String s="";
    for(int i=0;i<o.length;i++){
      if(i==e.length){
        s+=o[i];
      }else{
        s+=o[i];
        s+=e[i];
      }
    }
    System.out.println(s);
  }
}
