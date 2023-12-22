import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	int max = 0;
	int count = 0;
	String S_split[] = S.split("");
	for(int i = 0;i < S_split.length;i++){
		if(S_split[i].equals("I")){
			count += 1;
			max = Math.max(max,count);			
		}else if(S_split[i].equals("D")){
			count -= 1;			
			max = Math.max(max,count);
		}
	}
	System.out.println(max);
	}
}
	

