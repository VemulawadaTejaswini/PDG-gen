import java.util.Scanner;


public class Main {
	String s = "";
	char a;
	boolean flag;
	int count = 0;

	public static void main(String args[]){
		new Main().run();
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		//need loop
		//need loop
		while(true){
			s = sc.next();
			a = s.charAt(0);
			count = 0;
			if(a == '#')break;
			if(a == 'q' || a == 'w' || 
					a == 'e' || a == 'r' || a == 't' || a == 'a' ||
					a == 's' || a == 'd' || a == 'f' || a == 'g' ||
					a == 'z' || a == 'x' || a == 'c' || a == 'v' || a == 'b'){
				flag = true;
			}
			if(a == 'y' || a == 'u' || 
					a == 'i' || a == 'o' || a == 'p' || a == 'h' ||
					a == 'j' || a == 'k' || a == 'l' || a == 'n' ||
					a == 'm'){
				flag = false;
			}
			for(int i = 1; i < s.length(); i++){
				a = s.charAt(i);
				if(a == 'q' || a == 'w' || 
						a == 'e' || a == 'r' || a == 't' || a == 'a' ||
						a == 's' || a == 'd' || a == 'f' || a == 'g' ||
						a == 'z' || a == 'x' || a == 'c' || a == 'v' || a == 'b'){
					if(flag == false){
						count++;
						flag = true;
					}
				}
				if(a == 'y' || a == 'u' || 
						a == 'i' || a == 'o' || a == 'p' || a == 'h' ||
						a == 'j' || a == 'k' || a == 'l' || a == 'n' ||
						a == 'm'){
					if(flag == true){
						count++;
						flag = false;
					}
				}
			}
			System.out.println(count);
		}
		
	}
}