import java.util.Scanner;

public class main {
	public static void main(){
		Scanner in= new Scanner(System.in);
		int a=0,b=0,temp1,temp2;
		for(int i=0;i<in.nextInt();i++){
			temp1=in.nextInt();
			temp2=in.nextInt();
			if(temp1>temp2){
				a+=temp1+temp2;
			}
			else if(temp1==temp2){
				a+=temp1;b=a+=temp2;
			}
			else{
				b+=temp1+temp2;
			}
		}
		System.out.printf("%d %d\n",a,b);
	}
}