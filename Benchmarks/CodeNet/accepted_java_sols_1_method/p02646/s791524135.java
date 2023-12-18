import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        int dist = b-a;
        double tt = 0;
      	String ans = "YES";
      	if(b>a){
      	    tt = (double)(b-a)/(v-w);
      	}else if(a>b){
      	    tt = (double)(a-b)/(v-w);
      	}
        if(t<tt){
            ans = "NO";
        }else if(w>v){
            ans = "NO";
        }
        
        System.out.println(ans);
   }
}
