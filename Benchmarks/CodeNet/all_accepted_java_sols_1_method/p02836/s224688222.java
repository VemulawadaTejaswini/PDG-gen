import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String[] ss = S.split("", 0);
		int count = 0;
		for (int i = 0; i < ss.length / 2; i++){
			if(!ss[i].equals(ss[ss.length -1 - i])){
				count++;
			}
		}
		System.out.println(count);
	}
}