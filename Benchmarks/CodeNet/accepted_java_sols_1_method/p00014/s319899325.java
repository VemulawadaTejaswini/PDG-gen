import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int i,a;long b=0;
			a=sc.nextInt();
			for(i=a;i<600;i=i+a){
				b+=a*Math.pow(i,2);
			}
			System.out.println(b);
		}
		
	}
}