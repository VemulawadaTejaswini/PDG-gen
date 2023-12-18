import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c=1;
		int n;
		int sum=0;
		int num=0;
		char c1;
		while(c!=0){
		String str =sc.next();
		n=str.length();
			for(int i=0;i<n;i++){
				c1=str.charAt(i);
				if(c1=='0'){
					num=0;
				}
				if(c1=='1'){
					num=1;
				}
				if(c1=='2'){
					num=2;
				}
				if(c1=='3'){
					num=3;
				}
				if(c1=='4'){
					num=4;
				}
				if(c1=='5'){
					num=5;
				}
				if(c1=='6'){
					num=6;
				}
				if(c1=='7'){
					num=7;
				}
				if(c1=='8'){
					num=8;
				}
				if(c1=='9'){
					num=9;
				}
				sum+=num;
			}
			if(num==0&&n==1){
				break;
			}
		System.out.printf(sum+"\n");

		}
	}
}