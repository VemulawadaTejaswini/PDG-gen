import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(c==0){
				if(a==1 && b==1){
					System.out.println("Open");
				}else{
					System.out.println("Close");
				}
			}else{
				System.out.println("Open");
			}
		}
	
	}	
}