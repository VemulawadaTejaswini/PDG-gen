import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do{
			int x = sc.nextInt();
			if(x==0){
				break;
			}else{
				System.out.printf("Case %d:%d\n",i,x);
				i++;
			}
		}while(true);
	}
}