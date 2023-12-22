import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("");
		int count = 0;
		for(int i=0;i<str.length;i++){
			if(!(str[i].equals(str[str.length -1 - i]))){
				str[str.length - 1 - i] = str[i]; 
				count++;
			}
		}
		System.out.println(count);
	}
}
