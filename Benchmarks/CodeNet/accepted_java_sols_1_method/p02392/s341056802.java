import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,c;
		Scanner br=new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		c=br.nextInt();
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}