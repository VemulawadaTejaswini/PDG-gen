import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int cnt = 0;
      for(int i = 0;i < h;i++){
      	char[] c = sc.next().toCharArray();
        for(int j = 0;j < w;j++)if(c[j]=='#')cnt++;
      }
      if(cnt==h+w-1)System.out.println("Possible");
      else System.out.println("Impossible");
    }
}