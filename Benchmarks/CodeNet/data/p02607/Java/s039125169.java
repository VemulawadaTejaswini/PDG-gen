import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String aa[]=sc.nextLine().split(" ");
		int ans=0;
		for(int i=0;i<aa.length;i+=2)
		{
			if(Integer.parseInt(aa[i])%2!=0){ans+=1;}
		}
		System.out.println(ans);
	}
}