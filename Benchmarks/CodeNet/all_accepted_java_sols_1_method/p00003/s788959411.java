import java.util.Scanner;

public class Main{
       public static void main(String[] args){
       int i,j,k,a,b,c;
    	String[] data;
 
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        data = new String[k];
        i = 0;
        while(i < k){
        	a = scan.nextInt();
        	b = scan.nextInt();
        	c = scan.nextInt();
        	a=a*a;
        	b=b*b;
        	c=c*c;
        	if(a>b && a>c){
        		b = b + c;
        		if(a == b){
        			data[i]="YES";
        		}else{
        			data[i]="NO";
        		}
        	}else if(b>a && b>c){
        		a = a + c;
        		if(b == a){
        			data[i]="YES";
        		}else{
        			data[i]="NO";
        		}
        	}else if(c>a && c>b){
        		a = a + b;
        		if(c == a){
        			data[i]="YES";
        		}else{
        			data[i]="NO";
        		}
        	}else{
        		data[i]="NO";
        	}
        	i++;
        }
        
        
        j = 0;
        while(j < i){
        	System.out.println(data[j]);
        	j++;
       		}
       		}
}