import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int i,j,maxago=Integer.MIN_VALUE,min,max=Integer.MIN_VALUE;
	
	Scanner sca = new Scanner(System.in);
	i=sca.nextInt();
	int[] hai= new int[i];
	hai[0]=sca.nextInt();
	min=hai[0];
	for(i=1;i<hai.length;i++){//i->max(assuming)
	    hai[i]=sca.nextInt();
	    if(hai[i]-min>maxago){
		max=hai[i];
		maxago=max-min;
	    }
	    if(hai[i]<min){
		min=hai[i];
	    }
	    
	}
	System.out.println(maxago);
    }
}

