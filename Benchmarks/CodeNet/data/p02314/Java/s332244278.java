import java.util.Scanner;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int[] c=new int[m];
		int [] count=new int[m];
		for(int i=0;i<m;i++){
			c[i]=scan.nextInt();
			count[i]=0;
		}
		int num=n,index=m-1,flag=0;
		while(true){
			//System.out.println("in"+index+"fla"+flag+"con"+count[flag]);
			if(index==0){
				index=flag-1;
				flag=0;
				num=n;
			}
			if(index==-1){
				break;
			}
			if(num-c[index]>=0){
				num=num-c[index];
				if(flag==0){
					flag=index;
				}
				count[flag]++;
			}
			else{
				index--;
			}
			
		}
		int min=n;
		for(int i=1;i<m;i++){
			//System.out.println("i"+i+"con"+count[i]+"min"+min);
			if(min>count[i] && count[i]!=0){
				min=count[i];
			}
			if(min==0){
				min=n;
			}
		}
		System.out.println(min);
	}
}