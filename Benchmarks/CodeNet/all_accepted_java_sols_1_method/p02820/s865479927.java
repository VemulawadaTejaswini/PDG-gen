import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long o=0;
     
       int n=sc.nextInt(); 
      int k=sc.nextInt(); 
      int r=sc.nextInt(); 
      int s=sc.nextInt(); 
      int p=sc.nextInt(); 
      String t=sc.next(); 
       boolean[] b=new boolean[n]; //連続になっている
      for(int i=0;i<k;i++){
      	if(t.charAt(i)=='r'){
        	o+=p;
        }else if(t.charAt(i)=='s'){
        	o+=r;
        }else if(t.charAt(i)=='p'){
        	o+=s;
        }
      }
      for(int i=k;i<n;i++){
        if(t.charAt(i)==t.charAt(i-k)&&b[i-k]){	//3bannme
          b[i]=false;
        }else if(t.charAt(i)==t.charAt(i-k)){	//2bannme
          b[i]=true;
          o+=0;
          continue;
        }
        if(t.charAt(i)=='r'){
        	o+=p;
        }else if(t.charAt(i)=='s'){
        	o+=r;
        }else if(t.charAt(i)=='p'){
        	o+=s;
        }
      }
      System.out.println(o);
    }
}