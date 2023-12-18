import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit==true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0)exit=false;
			if(exit==true){
				int count=0;
				for(int j=1;j<a;j++){
					if(j==4 || j==6 || j==9){
						count+=30;
					}else if(j==2){
						count+=29;
					}else{
						count+=31;
					}
				}
				count+=b;
				if(count%7==1){
					System.out.println("Thursday");
				}else if(count%7==2){
					System.out.println("Friday");
				}else if(count%7==3){
					System.out.println("Saturday");
				}else if(count%7==4){
					System.out.println("Sunday");
				}else if(count%7==5){
					System.out.println("Monday");
				}else if(count%7==6){
					System.out.println("Tuesday");
				}else if(count%7==0){
					System.out.println("Wednesday");
				}
				
			}
		}
	}
}