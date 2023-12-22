
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] ans = new int[1000];
		String[] str = new String[1000];
		int i = 0;
		int k = 0;
		int count = 0;
		int max = 0;
		while(stdIn.hasNext()){
			str[i] = stdIn.next();
			for(int j=0;j<i;j++){
				if(str[i].equals(str[j])){
					ans[j]++;
					if(max<ans[j]){
						max = ans[j];
					}
					break;
				}
			}
			if(count<str[i].length()){
				count = str[i].length();
				k = i;
			}
			i++;
			
		}
		
		for(int x=0;x<1000;x++){
			if(max==ans[x]){
				System.out.print(str[x]+" ");
			}
		}
		System.out.println(str[k]);
	}
}