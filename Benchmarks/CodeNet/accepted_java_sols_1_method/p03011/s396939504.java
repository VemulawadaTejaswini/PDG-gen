import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int min=p+q;
		if(min>q+r)
			min=q+r;
		if(min>p+r)
			min=p+r;
		System.out.println(min);
	}
		
}