import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int z=0,max=A,mid=B,min=C;
		if(max<B){
			max=B;mid=A;
		}
		if(max<C){
			max=C;min=A;
		}
		if(mid<min){
			z=mid;mid=min;min=z;z=0;
		}
		z+=(max-min)/2+(max-mid)/2;
		if((max-min)%2==0&&(max-mid)%2==0)
			System.out.println(z);
		if((max-min)%2==1&&(max-mid)%2==1)
			System.out.println(z+1);
		if((max-min)%2==1&&(max-mid)%2==0)
			System.out.println(z+2);
		if((max-min)%2==0&&(max-mid)%2==1)
			System.out.println(z+2);
	}
}