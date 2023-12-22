import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			for(int i=0;i<3;i++){
				char s[] = sc.next().toCharArray();
				if(s[0] == '0') return;

				int a=0, b=0;
				for(int j=1;j<s.length;j++){
					if(s[j] == 'A') a++;
					else b++;
				}
				if(a > b) a++; else b++;
				System.out.println(a + " " + b);
			}
		}
	}
}