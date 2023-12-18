import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
		while(true){
			int count=0;
			int scan=sc.nextInt();
			if(scan==0)break;
			for(int i=0;i<=scan/2;i++){
				if(judge(i)&&judge(scan-i))count++;
			}
			if(scan%2!=0&&judge(scan/2+1)){
				count++;
			}
			System.out.println(count);
		}	

	}
	static boolean judge(int temp){
		boolean judge=true;
		if(temp%2!=0){
			for(int i=3;i<temp;){
				if(temp%i==0){
					judge=false;
					break;
				}
				i=+2;
				
			}
		}else return false;

		if(temp<2)return false;
		else return judge;
	}
}