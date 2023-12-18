import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new aoj510().doIt();
	}
	class aoj510{
		void doIt(){
			boolean num[] = new boolean[31];
			for(int i = 0;i < 28;i++)num[sc.nextInt()] = true;
			for(int i = 1;i < 31;i++)if(!num[i])System.out.println(i);
		}
	}
}