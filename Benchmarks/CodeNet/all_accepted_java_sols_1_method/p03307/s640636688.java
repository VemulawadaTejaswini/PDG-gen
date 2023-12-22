import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for(int i=1;i<=N*2;i++){
	    if(N*i%2==0){
		System.out.print(N*i);
		break;
	    }
	}
    }
}
