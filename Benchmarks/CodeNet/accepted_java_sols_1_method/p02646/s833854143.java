import java.util.*;
public class Main{
 	public static void main(String[] args) {
 	    
		Scanner sc = new Scanner(System.in);
      	
      	int A = sc.nextInt();
      	int V = sc.nextInt();
      	int B = sc.nextInt();
      	int W = sc.nextInt();
      	int T = sc.nextInt();
      	
      	
      	double tt = 0;
      	
      	if(B>A){
      	    tt = (double)(B-A)/(V-W);
      	}else if(A>B){
      	    tt = (double)(A-B)/(V-W);
      	}
        if(T<tt){
            System.out.println("NO");
            return;
        }else if(W>V){
            System.out.println("NO");
            return;
        }
        
        System.out.println("YES");
      	
 	}
}
