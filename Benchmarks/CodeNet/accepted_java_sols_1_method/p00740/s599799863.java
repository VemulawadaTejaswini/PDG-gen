import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n=sc.nextInt(),p=sc.nextInt();
			if(n==0&&p==0) break;
			int[] person = new int[n];
			Arrays.fill(person, 0);
			int p_inBox=p;
			int result=0;
			LAST:for(;;){
				for(int i=0;i<n;i++){
					if(person[i]==p) {
						result=i;
						break LAST;
					}
					if(p_inBox==0){
						if(person[i]!=0){
							p_inBox=person[i];
							person[i]=0;
						}
					}else{
						p_inBox--;
						person[i]++;
					}
				}
			}
			System.out.println(result);
		}
	}
}