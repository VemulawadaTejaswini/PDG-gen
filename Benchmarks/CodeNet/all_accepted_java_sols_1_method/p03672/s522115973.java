import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int x=0;
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] spa = new String[a.length()];
		for(int i=a.length()-1;i>=0;i--){
			spa[i]=a.substring(0,i);
		}
		for(int j=a.length()-1;j>=0;j--){
			if(spa[j].equals(spa[j/2]+spa[j/2])){
				x = j;
				break;
			}
		}
		System.out.println(x);
	}
}