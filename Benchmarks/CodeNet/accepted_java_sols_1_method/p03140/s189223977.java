import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		int cou = 0;
		for(int i=0;i<p;i++){
			if((a.charAt(i)==b.charAt(i))&&(b.charAt(i)==c.charAt(i))){
				cou+=0;
			}else if(a.charAt(i)==b.charAt(i)){
				cou++;
			}else if(b.charAt(i)==c.charAt(i)){
				cou++;
			}else if(a.charAt(i)==c.charAt(i)){
				cou++;
			}else{
				cou+=2;
			}
		}
		System.out.println(cou);
	}
}