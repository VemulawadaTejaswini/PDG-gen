import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long countl=0,countr=0;
    long sum=0;
    for(int i=0;i<s.length();i++) {
    	if(s.substring(i, i+1).equals("<")) {
    		countl++;
    		if(i!=s.length()-1&&s.substring(i+1, i+2).equals(">")) {
    			
    		}else {
    			sum+=countl;
    		}
    	}else {
    		countr++;
    		if(i!=s.length()-1&&s.substring(i+1, i+2).equals("<")) {
    			if(countr>=countl) {
    				sum+=countr*(countr+1)/2;
    			}else {
    				sum+=countl;
    				sum+=countr*(countr-1)/2;
    			}
    			countl=0;
    			countr=0;
    		}else {

    		}
    	}
    	//System.out.print(sum);
    }
    //System.out.println();
    if(s.substring(s.length()-1, s.length()).equals(">")) {
		if(countr>=countl) {
			sum+=countr*(countr+1)/2;
		}else {
			sum+=countl;
			sum+=countr*(countr-1)/2;
		}
    }else {
    	//sum+=countl;
    }
    //System.out.println(sum+" "+countl+" "+countr);
    System.out.println(sum);
  }
}