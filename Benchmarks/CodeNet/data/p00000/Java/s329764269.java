import java.util.*;
public class Main2{
	public static void main(String args[]){
		List<Integer>[] a;
		int b=6;
		a=new ArrayList[10];
		a[1]=new ArrayList<Integer>();
		a[1].add(b);
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.printf("%dx%d=%d\n",i,j,i*j);
			}
		}
		
	}
}