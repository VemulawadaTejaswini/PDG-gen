import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		StringBuilder sb = new StringBuilder(st);
		for(int i = 0 ; i < sb.length(); i++){
			int appleindex = sb.indexOf("apple",i);
			int peachindex = sb.indexOf("peach",i);
			if(appleindex == -1 && peachindex == -1){
				break;
			}else if(peachindex == -1){
				sb.replace(appleindex, appleindex+5, "peach");
				i = appleindex+4;
			}else if(appleindex == -1){
				sb.replace(peachindex, peachindex+5, "apple");
				i = peachindex+4;
			}else{
				if(peachindex < appleindex){
					sb.replace(peachindex, peachindex+5, "apple");
					i = peachindex+4;
				}else{
					sb.replace(appleindex, appleindex+5, "peach");
					i = appleindex+4;
				}
			}
		}
		System.out.println(sb);
		sc.close();
	}
}