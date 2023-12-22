import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int flag = 0;
		for(int i = 0; i < s.length()-1; i++){
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
				flag = 1;
			}
		}
		System.out.print(flag == 1?"Bad":"Good");
	}
}
