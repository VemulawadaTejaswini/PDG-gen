import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
      	String S = sc.next();
      	String spt[] =S.split("");
      	int count = 1;
      	
      	for(int i=0;i<spt.length-1;i++){
      	    if(!(spt[i].equals(spt[i+1]))){
      	        count++;
      	    }
      	}
      	
      System.out.println(count);
    }
}
