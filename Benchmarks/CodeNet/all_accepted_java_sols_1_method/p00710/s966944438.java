import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()){
      int n=scan.nextInt();
      int r =scan.nextInt();
      if((n|r)==0)break;
      Stack <Integer> stack =new Stack<Integer>();
      for(int i=1;i<=n;i++)stack.push(i);
      
      for(int i=0;i<r;i++){
    	  int p=scan.nextInt();
    	  int c=scan.nextInt();
    	  Stack<Integer> tmp1 =new Stack<Integer>();
    	  Stack<Integer> tmp2 =new Stack<Integer>();
    	  for(int j=0;j<p-1;j++)tmp1.push(stack.pop());
    	  for(int k=0;k<c;k++)tmp2.push(stack.pop());
    	  
    	  for(int j=0;j<p-1;j++)stack.push(tmp1.pop());
    	  for(int k=0;k<c;k++)stack.push(tmp2.pop());
      }
      System.out.println(stack.peek());
    			  
      }
        }
      

}