import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int[] counter;
			counter = new int[26];
	while(sc.hasNext()){
		String str = sc.nextLine();
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
				if(Character.isLowerCase(ch)){
					int num = ch - 'a';
					counter[num]++;
				} else if(Character.isUpperCase(ch)){
					int num = ch - 'A';
					counter[num]++;
				}
		}
	}
		char a = 'a';
		for(int j = 0;j < 26;j++){
			System.out.println(a+" : "+counter[j]);
			a++;
		}
	}
}