import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i==1){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0&&y==0){
				break;
			}
			if(y<x){
				int z;
				z=x;
				x=y;
				y=z;
			}
			System.out.println(x+" "+y);
		}
	}
}