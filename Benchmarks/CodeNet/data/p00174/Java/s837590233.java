import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			String a = in.next();
			char[] num = a.toCharArray();
			if(num[0] == '0')break;
			int A = 0,B = 0;
			for(int i = 1;i < num.length;i++){
				if(num[i] == 'A'){
					A++;
				}else{
					B++;
				}
			}
			if(A > B)A++;
			else B++;
			System.out.println(A+" "+B);
		}
	}
}