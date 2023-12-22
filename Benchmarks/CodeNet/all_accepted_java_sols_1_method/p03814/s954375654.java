import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	char c[]=s.toCharArray();
int a=0;
int b=0;
	for(int i=0;i<s.length();i++){
		if(c[i]=='A'){
			a=i;
			break;
		}
	}
	for(int i=s.length()-1;i>0;i--){
		if(c[i]=='Z'){
			b=i;
			break;
		}
	}
System.out.println(b-a+1);
	}}