import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),max=0,f=0;
    char[] ch=sc.next().toCharArray();
    for(int i=0;i<n;i++){
      if(ch[i]=='I'){
        f++;
        max=Math.max(max,f);
      }else{
        f--;
      }
    }
    System.out.println(max);
  }
}
