import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int n1=a+b;
		int n2=a-b;
		int n3=a*b;
		if(n1>=n2&&n1>=n3){
			System.out.println(n1);
		}else if(n2>=n3){
			System.out.println(n2);
		}else{
			
			System.out.println(n3);
		
		}
		
		
	}

}
