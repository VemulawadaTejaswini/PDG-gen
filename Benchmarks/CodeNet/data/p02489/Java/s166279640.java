import java.util.Scanner;
public class Case {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=1;;i++){
			int x=sc.nextInt();
			if(x==0) break;
			else{
			System.out.println("Case %d: %d",i,x);
			}
		}
	}		
}