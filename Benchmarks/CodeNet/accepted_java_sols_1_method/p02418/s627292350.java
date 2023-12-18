import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String p=scan.next();
		
		int m=s.length();
		
		for(int i=0;i<m;i++){
			if(s.charAt(i)==p.charAt(0)){
				int j;
				for(j=0;j<p.length();j++){
					if(s.charAt((i+j)%m) != p.charAt(j))
						break;
				}
				if(j==p.length()){
					System.out.println("Yes");
					return;
				}
				
			}
		}
		System.out.println("No");
	}
}
