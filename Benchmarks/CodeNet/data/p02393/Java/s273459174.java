
import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Aoj aoj = new Aoj();
		aoj.Load(scan.nextInt(),scan.nextInt(),scan.nextInt());
		aoj.show();
	}
}

class Aoj{
	int[] num;
	public void Load(int... x){
		num = new int[x.length];
		for(int i=0; i<num.length;i++){
			num[i]=x[i];
			for(int j=0; j<i;j++)
				if(num[i-j]<num[i-j-1])
					swap(i-j,i-j-1);
		}
	}
	void swap(int x, int y){
		int tmp=num[x];
		num[x]=num[y];
		num[y]=tmp;
	}
	public void show(){
		for(int i=0; ;i++){
			System.out.print(num[i]);
			if(i==num.length-1)
				break;
			System.out.print(" ");
			
		}
		System.out.println("");
	}
	
}