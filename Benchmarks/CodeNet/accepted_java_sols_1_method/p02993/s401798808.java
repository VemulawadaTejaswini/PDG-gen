import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean s=true;
		String[] a=new String[4];

		for(int i=0;i<4;i++){
			a[i]=str.substring(i,i+1);
		}
		for(int i=0;i<3;i++){
			if(a[i].equals(a[i+1]))
				s=false;
		}
		if(s==true)
			System.out.println("Good");
		else
			System.out.println("Bad");
		
	}
}