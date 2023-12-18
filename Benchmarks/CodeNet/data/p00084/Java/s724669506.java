import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while(sc.hasNext()){
			String temp = sc.next();
			int ans = temp.length();
			if(temp.contains(".") || temp.contains(" ") || temp.contains(",")){
				ans -= 1;
				temp = temp.substring(0, temp.length() - 1);
			}
			if(ans >= 3 && 6 >= ans){
				output += temp + " ";
			}
		}
		output = output.substring(0, output.length() -1);
		System.out.println(output);
		
	}
}