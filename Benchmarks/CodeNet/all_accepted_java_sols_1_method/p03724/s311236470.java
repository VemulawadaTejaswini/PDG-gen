import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		int M = cin.nextInt();
		int list[] = new int[2*M];
		int tmp = 0;
		int count=1;
		String result = "YES";

		for(int i=0;i<2*M;i++){
			list[i] = cin.nextInt();
		}
		cin.close();
		Arrays.sort(list);
		tmp = list[0];
		for(int j=0;j<2*M;j++){
			if(j<2*M-1&&tmp==list[j+1]){
				count++;
			}else{
				if(count%2==0){
					count=1;
					if(j<2*M-1){
						tmp = list[j+1];
					}
				}else{
					result = "NO";
					break;
				}
			}
		}
		System.out.println(result);
	}
}
