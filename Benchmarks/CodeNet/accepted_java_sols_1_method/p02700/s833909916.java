import java.util.*;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int HP1 = sc.nextInt();
		int ATK1 = sc.nextInt();
		int HP2 = sc.nextInt();
		int ATK2 = sc.nextInt();
		
        while(true){
          	HP2 -= ATK1;
			if(HP2<1){
				System.out.println("Yes");
        		return;
			}
          
			HP1 -= ATK2;
			if(HP1<1){
				System.out.println("No");
        		return;
			}
			
        }
	}


}
