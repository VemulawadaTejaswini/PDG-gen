import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=1,x;
		while(true){
			System.out.print("case "+i+": "); x=sc.nextInt();
			if(x==0){
				break;
			}
			i++;
		}
		sc.close();
	}
}

