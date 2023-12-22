import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int a=sc.nextInt();
		int sum=0;
		for(int i=1; i<=h; i++){
			sum=h-a*i;
			if(sum<=0){
				System.out.println(i);
				break;
			}
		}
	}
}