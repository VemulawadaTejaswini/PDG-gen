import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String tmp = "";
		while((tmp = sc.nextLine()) != null){
			for(int i = 0; i < tmp.length(); i++){
				int keep = tmp.charAt(i);
				if(keep >= 'a' && keep <= 'z'){
					arr[keep - 'a']++;
				}else if(keep >= 'A' && keep <= 'Z'){
					arr[keep - 'A']++;
				}
			}
			for(int i= 0; i < arr.length; i++){
				System.out.println((char)('a' + i) + " : " + arr[i]);
			}
		}
	}
}