import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[]args){
		int[] c=new int[8];
		int[] m={1,2,1,2,1,4,1,4};
		int sum=0,buf=0,n=0;
		Scanner s =new Scanner(System.in);
		while(s.hasNext()){
			for(int i=0;i<8;i++){
				c[i]=s.nextInt();
			}
			for(int i=0;i<8;i++){
				buf=0;
				for(int j=0;j<8;j++){
					if(c[j]-m[(i+j)%8]>0)
						buf=buf+(c[j]-m[(i+j)%8]);
				}
				if(sum>buf||i==0){
					n=i;
					sum=buf;
				}
			}
			for(int i=0;i<8;i++){
				System.out.print(Integer.toString(m[(n+i)%8])+" ");
			}
			System.out.println();
		}
	}
}