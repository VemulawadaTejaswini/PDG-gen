import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			int data[]=new int[4];
			for(int j=0;j<4;j++)data[j]=in.nextInt();
			int sum=data[0]*data[2]+data[1]*data[3];
			if(data[2]>=5 && data[3]>=2)sum*=0.8;
			
			if(data[2]<5)data[2]=5;
			if(data[3]<2)data[3]=2;
			int itc=data[0]*data[2]+data[1]*data[3];
			itc*=0.8;
			sum=Math.min(sum, itc);
			System.out.println(sum);
		}
	}

}
