import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=3;i<=num;i++){
			if(i%3==0){
				System.out.printf(" %d",i);
			}else if(i%1==3){
				System.out.printf(" %d",i);
			}else if(i%10==3){
				System.out.printf(" %d",i);
			}else if(i%100>=30&&i%100<=39){
				System.out.printf(" %d",i);
			}else if(i%1000>=300&&i%1000<=399){
				System.out.printf(" %d",i);
			}else if(i%10000>=3000&&i%10000<=3999){
				System.out.printf(" %d",i);
			}
		}
		System.out.println("");

	}
}