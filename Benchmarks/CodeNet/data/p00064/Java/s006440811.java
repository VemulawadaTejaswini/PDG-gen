import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = 0,sum = 0;
		
		while(sc.hasNext()){
			char[] ch = sc.next().toCharArray();
		for(int i = 0; i < ch.length; i++){
			if('0' <= ch[i] && ch[i] <= '9'){
				n = n * 10;
				n += ch[i] - '0';
			}else{
				sum += n;
				n = 0;
			}
		}
		sum += n;
		}
		System.out.println(sum);
		
		sc.close();
	}
}