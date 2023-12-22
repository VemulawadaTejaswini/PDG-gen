import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt();
		int train,bus;
		if(A<B){
			train=A;
		}else{
			train=B;
		}
		if(C<D){
			bus=C;
		}else{
			bus=D;
		}
		System.out.println(train+bus);
	}
}
