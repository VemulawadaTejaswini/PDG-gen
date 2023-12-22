import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 10000;
		for(int i = 0; i < s.length() - 2; i++){
			String s2 = s.substring(i,i+3);
			int num = Integer.parseInt(s2);
			if(min > Math.abs(753 - num)){
				min = Math.abs(753 - num);
			}
		}
		System.out.print(min);
	}
}
