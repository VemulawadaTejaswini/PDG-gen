import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> set=new ArrayList<Integer>();
		int a=1;
		int b=1;
while (!(a==0 && b==0)){
		a=in.nextInt();
		b=in.nextInt();
		set.add(a);
		set.add(b);
}
	for(int k=0;k<(set.size()-2);k+=2){
		for (int i=0;i<set.get(k);i++) {
			for (int j=0;j<set.get(k+1);j++) {
				if((i+j)%2==0){
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