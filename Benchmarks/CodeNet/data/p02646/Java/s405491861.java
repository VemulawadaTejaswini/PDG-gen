import java.util.*;

public class Main{
	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int v = sc.nextInt();
      int b = sc.nextInt();
      int w = sc.nextInt();
      int t = sc.nextInt();
      
      if(((a>=-1000000000)&&(a<=1000000000)) &&((b>=-1000000000)&&(b<=1000000000))){
        if(((v>=1)&&(v<=1000000000))&&((w>=1)&&(w<=1000000000))&&((t>=1)&&(t<=1000000000))&&(a!=b)){
          long agoal = ((long)t*(long)v)+a;
          long bgoal = ((long)t*(long)w)+b;
          System.out.println(agoal);
          System.out.println(bgoal);
          
          if(agoal>=bgoal){
        	System.out.println("YES");
          }else{
            System.out.println("NO");
          }
        }
      }
    }
}