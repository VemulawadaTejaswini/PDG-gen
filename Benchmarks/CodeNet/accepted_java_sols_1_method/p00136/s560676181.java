
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=new String[6];
		int n=sc.nextInt();
		for(int i=0;i<6;i++){
			str[i]="";
		}
		while(n--!=0){
			double d=sc.nextDouble();
			if(185.0<=d){
				str[5]+="*";
			}
			else if(180.0<=d){
				str[4]+="*";
			}
			else if(175.0<=d){
				str[3]+="*";
			}
			else if(170.0<=d){
				str[2]+="*";
			}
			else if(165.0<=d){
				str[1]+="*";
			}
			else{
				str[0]+="*";
			}
		}
		for(int i=0;i<6;i++){
			System.out.println((i+1)+":"+str[i]);
		}
	}
}