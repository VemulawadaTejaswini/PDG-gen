import java.util.*;
public class Main{
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	void bc(){
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a<b){
			System.out.println("a < b");
		}else if(a>b){
			System.out.println("a > b");
		}else if(a==b){
			System.out.println("a == b");
		}
		
	}
	
	public static void main(String[] args){     
		new Main().bc();     
		} 
	}