public class Main {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner (System.in);
			int w = sc.nextInt();
			int h = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			
			if (x - r >= 0 && x + r <= w){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
			if(y - r >= 0 && y + r <= w){
				System.out.println("Yes");
			} else{
				System.out.println("No");
			}
	}
}