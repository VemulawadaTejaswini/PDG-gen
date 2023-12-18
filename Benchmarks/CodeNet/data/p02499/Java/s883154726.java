import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int[] count = new int[26];
		String[] alfa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] s = sc2.nextLine().split("");
		for(String s1: s){
			if(!s1.equals("")){
				for(int i=0;i<alfa.length;i++){
					if(s1.equalsIgnoreCase(alfa[i])){
						count[i]++;
					}
				}
			}
		}
		for(int i=0;i<alfa.length;i++){
			System.out.println(alfa[i]+" : "+count[i]);
		}
	}
}