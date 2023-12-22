import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String y = scan.next();
		String[] ya = y.split("");
		String a = x + x;
		String[] aa = a.split("");
		int len = aa.length - ya.length;
		int i,m,t;
		t = 0;
		for(i = 0; i < len; i++){
			t = 0;
			for(m = 0; m < y.length(); m++){
				if(aa[i + m].equals(ya[m])){
					++t;
				}
			}
				if(t == y.length()){
					System.out.println("Yes");
					break;
				}
				
			
			}
		if(t != y.length())
			System.out.println("No");
 			}

	}


	