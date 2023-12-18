import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
		while(sc.hasNextInt()){
			int count=0;
			int scan=sc.nextInt();
			if(scan==0)break;
			for(int i=0;i<=scan/2;i++){
				if(judge(i)&&judge(scan-i))count++;
			}
			if(scan%2!=0&&judge(scan/2+1)){
				count++;
			}
			pr.println(count);
		}
		pr.flush();
		


	}
	static boolean judge(int temp){
		boolean judge=true;
		for(int i=2;i<temp;i++){
			if(temp%i==0)judge=false;
		}
		if(temp<2)return false;
		else return judge;
	}
}