import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int a=0,b=0,temp1,temp2,j;
		j=in.nextInt();
		while(j!=0){
			
			for(int i=0;i<j;i++){
				temp1=in.nextInt();
				temp2=in.nextInt();
				if(temp1>temp2){
					a+=temp1+temp2;
				}
				else if(temp1==temp2){
					a+=temp1;b+=temp2;
				}
				else{
					b+=temp1+temp2;
				}
				
			}
			System.out.printf("%d %d\n",a,b);
			a=0;b=0;
			j=in.nextInt();
			
		}
	}
}