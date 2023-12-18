import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
		int i=1,j=1,res1=b,res2=d;
		while(true){
			if(a*i>n)break;
			res1=b*i;
			i++;
		}
		while(true){
			if(c*j>n)break;
			res2=d*j;
			j++;
		}
		int res=Math.max(res2,res1);
		System.out.println(res);
	}

}

