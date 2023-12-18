import java.util.Scanner;

public class Main{
	public static String operation(String data){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < data.length(); i++){
			int counter = 1;
			while( data.charAt(i) == data.charAt(i+1) ){
				counter++;
				i++;
				if( i == data.length()-1 ){
					break;
				}
			}
			sb.append(String.valueOf(counter));
			sb.append(data.charAt(i));
			if( i == data.length()-2 ){
				sb.append("1");
				sb.append(data.charAt(i+1));
				break;
			}
		}
		return sb.toString();
	}
			
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int index = 0;
		String[] ans = new String[1000];
		
		while( n != 0 ){
			ans[index] = new String();
			ans[index] = stdIn.next();
			while( n-- > 0 ){
				String temp = new String(ans[index]);
				ans[index] = operation(temp);
			}
			index++;
			n = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(ans[i]);
		}
	}
}