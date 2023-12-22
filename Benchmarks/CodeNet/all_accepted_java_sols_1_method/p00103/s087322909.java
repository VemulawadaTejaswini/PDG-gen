import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int out =0;
        int point=0;
        int runner=0;
        while(true){
        	if(n==0)break;
        	String input =scan.next();
        	if(input.equals("HIT")){runner++;if(runner==4){runner=3;point++;}}
        	else if(input.equals("OUT"))out++;
        	else {point +=runner+1;runner =0;}
        	
        	if(out==3){
        		System.out.println(point);
        		out=point=runner=0;
        		n--;
        		continue;
        	}
        	
        	
        }
      

  }
  }