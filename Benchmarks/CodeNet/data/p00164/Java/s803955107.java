import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int i=sc.nextInt();
			if(i==0)break;
			int o=32,k=0;
			int []a=new int[i];
			for(int n=0;n<i;n++)a[n]=sc.nextInt();
			while(true){
				o-=(o-1)%5;
				System.out.println(o);
				o-=a[k];
				if(o<=0){
					System.out.println(0);
					break;
				}
				
				System.out.println(o);
				k++;
				if(k==i)k=0;
			}
		}
	}
}