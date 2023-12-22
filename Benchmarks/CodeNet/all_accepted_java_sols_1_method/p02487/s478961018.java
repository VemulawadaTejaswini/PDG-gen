import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> set=new ArrayList<Integer>();
		int a=1;
		int b=1;
		int c,d;
while (!(a==0 && b==0)){
		a=in.nextInt();
		b=in.nextInt();
		set.add(a);
		set.add(b);
}
	for(int k=0;k<(set.size()-2);k+=2){
		c=set.get(k);
		d=set.get(k+1);
		for (int i=0;i<c;i++) {
			for (int j=0;j<d;j++) {
				if (i*j*(j-d+1)*(i-c+1)==0) {
					System.out.print("#");
				}else{
					System.out.print(".");
				}
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
	}
	}
}