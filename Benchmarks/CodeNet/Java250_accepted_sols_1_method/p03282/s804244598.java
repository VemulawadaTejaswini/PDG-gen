import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		long k=sc.nextLong();
		int i=0;
		while(i<s.length){
			if(s[i]=='1'){
				i++;
			}else{
				break;
			}
		}
		if(k<=i){
			System.out.println(1);
		}else{
			System.out.println(s[i]);
		}
		
	}
}