import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int a;
		while(true){
			if(i%3==0){
				System.out.printf(" %d", i);
			}else{
				a=i;
				while(true){ 
					if(a%10==3){
					System.out.printf(" %d", i);
					break;
					}
					a/=10;
					if(a==0){
						break;
					}
				}
			}
			if(i==n){
				System.out.println();
				break;
			}
			i++;

		}
	}
}