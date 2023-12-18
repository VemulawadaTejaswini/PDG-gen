import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] split=sc.next().toCharArray();
    
    int n=split.length;
  	long sum=0;
    for(int i=0;i<(1<<n-1);i++){
    	StringBuffer sb=new StringBuffer();
      for(int j=0;j<n;j++){
      	sb.append(split[j]);
        if((1&i>>j)==1){
        	sb.append("+");
        }
        
      }
    	String[] snum=sb.toString().split("\\+");
      for(int k=0;k<snum.length;k++){
      	sum+=Long.parseLong(snum[k]);
      }
    }
    System.out.println(sum);
  }
}
