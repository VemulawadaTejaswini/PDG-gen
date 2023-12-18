import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		char [] s=new char[line.length()];
		for(int i=0; i<line.length(); i++){
			if(Character.isUpperCase(line.charAt(i))){
				s[i]=Character.toLowerCase(line.charAt(i));
			}else if(Character.isLowerCase(line.charAt(i))){
				s[i]=Character.toUpperCase(line.charAt(i));
			}else{
				s[i]=line.charAt(i);
			}
		}
		for(int j=0; j<s.length; j++){
			System.out.print(s[j]);
		}
		System.out.println();
		}


}
