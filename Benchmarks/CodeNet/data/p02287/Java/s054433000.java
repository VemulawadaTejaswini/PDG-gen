import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sca=new Scanner(System.in);
		int num=sca.nextInt();
		int arr[]=new int[num];
		
		for(int i=0;i<num;i++){
			arr[i]=sca.nextInt();
		}
		
		for(int i=0;i<num;i++){
			System.out.print("node "+(i+1)+": key = "+arr[i]+", ");
			if((i-1)/2>=0 && i!=0){
				System.out.print("parent key = "+arr[(i-1)/2]+", ");
			}
			if(i*2+1<num){
				System.out.print("left key = "+arr[i*2+1]+", ");
			}
			if(i*2+2<num){
				System.out.print("right key = "+arr[i*2+2]+", ");
			}
			System.out.println();
		}
		
		
	}	
}

