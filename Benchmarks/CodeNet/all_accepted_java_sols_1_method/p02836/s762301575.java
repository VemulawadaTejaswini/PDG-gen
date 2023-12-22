import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] str = S.split("");
		int num = str.length / 2;
		int count = 0;
		
		for(int i = 0; i < num; i++){
			if(str[i].equals(str[str.length - (i+1)])){
				continue;
			}
			else{
				str[i] = str[str.length - (i+1)];
				count++;
			}
		}
		System.out.println(count);
	}
}