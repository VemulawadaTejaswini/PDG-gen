import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		Boolean[] check = new Boolean[100000000];
		
		int n = Integer.parseInt(sc2.nextLine());
		String[] s = sc2.nextLine().split("[\\s]+");
		for(int i=0;i<n;i++) check[Integer.parseInt(s[i])] = true;
		
		
		int n2 = Integer.parseInt(sc2.nextLine());
		String[] s2 = sc2.nextLine().split("[\\s]+");
		if(s2[0].equals("")){
			for(int i=0;i<n2;i++){
				s2[i] = s[i+1];
			}
		}
		
		for(int i=0;i<n;i++){
			if(check[Integer.parseInt(s[i])] == true){
				count++;
				check[Integer.parseInt(s[i])] = false;
			}
		}
		
		System.out.println(count);
	}
}