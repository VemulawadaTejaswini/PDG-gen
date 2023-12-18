import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
     	int[] x=new int[4];
      	for(int i=0;i<2;i++){
        	int m=sc.nextInt();
          		x[m]++;
        }
      	for(int i=1;i<=3;i++){
        	if(x[i]==0){
            	System.out.print(i);
              	break;
            }
        }
    }
}