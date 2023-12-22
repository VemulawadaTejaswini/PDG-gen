import java.util.Scanner;
class Main {
	public static void main(String[] args){
		String[] str = new String[2];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			str = sc.nextLine().split(" ");
			System.out.println(Integer.valueOf(str[0])+Integer.valueOf(str[1]));
		}
	}
}