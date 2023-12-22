import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		String[] p = sc.nextLine().split("");
		
		for(int i=0; i<s.length; i++){
			boolean flag = true;
			for(int j=0; j<p.length; j++){
				if(!s[(i+j)%s.length].equals(p[j])){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}

}