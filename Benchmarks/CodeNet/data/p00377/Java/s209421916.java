import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int f=in.nextInt()+1,n=in.nextInt();
		int sum=0,res=0;
		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(in.next());
		}
		
		res=sum/f+((sum%f>0)? 1:0);
		System.out.println(res);
	}

}

