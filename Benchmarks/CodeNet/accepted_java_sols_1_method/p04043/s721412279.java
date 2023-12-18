import java.util.*;
import java.lang.*; 
class Main{
	public static void main(String[] args){
		int x=0;
		Scanner input=new Scanner(System.in);
	int a[]=new int [3];
	for(int i=0; i<3; i++)
	{
		a[i]=input.nextInt();
	}
	for(int j=0;j<3;j++)
	{
		x=x+a[j];
	}
		if(x==17)
		{
			System.out.println("YES");
		}
		else{System.out.println("NO");}
	}
}

