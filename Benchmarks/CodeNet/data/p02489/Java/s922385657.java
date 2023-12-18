import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int i=1;
		while(true){
			int x=sc.nextInt();
			System.out.println("Case" + i +":" + x);
			if(x==0){
				break;
			}else{
				i++;
			}
			
		}
	}
}