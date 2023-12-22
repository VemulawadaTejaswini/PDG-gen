import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int i,j,l;
    	j=0;
    	for(i=0;i<n;i++){
    		l=sc.nextInt();
    		while(l%2==0){
    			l=l/2;
    			j++;
    		}
    	}
    	System.out.println(j);
    }
}