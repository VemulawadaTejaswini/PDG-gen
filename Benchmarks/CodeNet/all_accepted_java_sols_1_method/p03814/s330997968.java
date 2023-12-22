import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	String s = sc.next();
      	String word[] =s.split("");
      	int i = word.length;
      	int j =0;
      	int A=0;
      	int B=0;
      	int count =0;
      	int resultA =0;
      	int resultB =0;
      	
      	while(B==0 && resultB==0){
      	    i--;
      	    if(word[i].equals("Z")){
      	        B=i;
      	        resultB =1;
      	    }
      	   
      	}
      	
      	while(A==0 && resultA ==0){
      	    if(word[j].equals("A")){
      	        A=j;
      	        resultA =1;
      	    }
      	    j++;
      	}
      	
      	
      	System.out.println(B-A+1);
 
    }
}