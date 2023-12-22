import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int max = 0;
		for(int i=0;i<s.length();i++){
			int n = 0;
			for(int j=0;j<t.length()&&i+t.length()<=s.length();j++){
				if(s.charAt(i+j) == t.charAt(j)){
					n++;
				}
			}
			if(max < n){
				max = n;
			}
		}
		System.out.println(t.length()-max);
		sc.close();
	}
}

