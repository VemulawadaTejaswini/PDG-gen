import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char a='1';
		char b='2';
		int aa=1;
		int bb=1;
		for(int i=0; i<s.length(); i++){
			if(i==0){
				a=s.charAt(i);
				continue;
			}
			if(s.charAt(i)!=a && b=='2'){
				b=s.charAt(i);
				continue;
			}
			if(s.charAt(i)!=a && s.charAt(i)!=b){
				System.out.println("No");
				return;
			}else{
				if(s.charAt(i)==a){
					aa++;
				}else{
					bb++;
				}
			}
		}
		if(aa==2 && bb==2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}


