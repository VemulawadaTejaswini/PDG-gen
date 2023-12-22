import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			boolean check=false;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='C'){
					for(int j=i+1;j<s.length();j++){
						if(s.charAt(j)=='F') check=true;
					}
				}
			}
			System.out.println(check ? "Yes" : "No");
		}
	}
}