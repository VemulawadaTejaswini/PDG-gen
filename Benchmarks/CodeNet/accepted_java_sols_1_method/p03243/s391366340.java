import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int num=0;
		for(int i=1;i<=9;i++){
		    if(N<=i*100+i*10+i){
		        num=i*100+i*10+i;
		        break;
		    }
		        
		}
		System.out.println(num);
		
	}
}