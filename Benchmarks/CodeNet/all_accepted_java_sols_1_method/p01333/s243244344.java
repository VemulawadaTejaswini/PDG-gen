import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c,x,y,z;

		while(true){
			if(a==0 && b==0)
				break;
		
			c=b-a;
			
			for(x=0;c>=1000;x++){
				c=c-1000;
			}
			
			for(y=0;c>=500;y++){
				c=c-500;
			}
			
			for(z=0;c>=100;z++){
				c=c-100;
			}
			
			System.out.println(z+" "+y+" "+x);
			
			a = sc.nextInt();
			b = sc.nextInt();
		}

	}

}