import java.util.Scanner;
 
 
 
class Main {
 
	public static void main(String[] argv){
 
		Scanner sc = new Scanner(System.in);
 
		String s = sc.nextLine();
 
		sc.close();
 
		char[] c = s.toCharArray(); 
		for(int i = 0;i<4;i++){
System.out.print(c[i]);
}
System.out.print(" ");
for(int i=4;i<12;i++){ System.out.print(c[i]); }
System.out.println(); 
 
 
 
	}
 
}