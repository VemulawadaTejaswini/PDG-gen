import java.util.Scanner;

public class Shuffle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
		String a=sc.next();
			if(a.equals("-")){
				break;
			}
			int m,h,i;
			m=sc.nextInt();
			for(i=0;i<m;i++){
				h=sc.nextInt();
				String a1=a.substring(0,h);
				String a2=a.substring(h);
				a=a2+a1;
			}
			System.out.println(a);
		}
	}	
}