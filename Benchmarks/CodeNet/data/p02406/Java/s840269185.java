import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=3;i<=num;i++){
			if(i%3==0){
				System.out.printf(" %d",i);
			}else if(i%10==3){
				System.out.printf(" %d",i);
			}else if(i%100==3){
				System.out.printf(" %d",i);
			}else if(i%1000==3){
				System.out.printf(" %d",i);
			}else if(i%10000==3){
				System.out.printf(" %d",i);
			}
		}
		System.out.println("");

	}
}