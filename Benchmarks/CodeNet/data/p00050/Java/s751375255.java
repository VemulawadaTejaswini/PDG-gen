import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] st = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < st.length ; i++){
			if(st[i].equals("apple")){
				sb.append("peach ");
			}else if(st[i].equals("apple.")){
				sb.append("peach. ");
			}else if(st[i].equals("peach")){
				sb.append("apple ");
			}else if(st[i].equals("peach.")){
				sb.append("apple. ");
			}else{
				sb.append(st[i]+" ");
			}
		}
		System.out.println(sb.substring(0,sb.length()-1));
		sc.close();
	}
}