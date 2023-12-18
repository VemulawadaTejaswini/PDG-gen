import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		do{
			int x = sc.nextInt();
			int i = 1;
			if(x==0){
				break;
			}else{
				System.out.printf("Case %d:%d\n",i,x);
				i++;
			}
		}while(true);
	}
}