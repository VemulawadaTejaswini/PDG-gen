import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3 == 0){
				System.out.printf(" %d",i);
			}else{
				func(i,i);
			}
		}
		System.out.printf("\n");
	}
	
	public static void func(int i,int j){
		if(j%10 == 3){
			System.out.printf(" %d",i);
		}else if(j>0){
			func(i,j/10);
		}
	}

}