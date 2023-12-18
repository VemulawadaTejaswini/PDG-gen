public class Maint {
	public static void main(String args[]){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if(m == (-1) && f == (-1) && r == (-1)){
				break;
			}else if(m+f >= 80){
				System.out.println("A");
			}else if(65 <= m+f && m+f < 80){
				System.out.println("B");
			}else if(50 <= m+f && m+f <65){
				System.out.println("C");
			}else if(30<=m+f && m+f<50){
				if(r>50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}
		}

	}

}