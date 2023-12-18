
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" "),ans1,ans2;
		int max=0;
		ans1=ans2="";
		
		for(int i=0;i<str.length;i++){
			if(max<str[i].length()){
				max=str[i].length();
				ans1=str[i];
			}
		}
		
		int count;
		max=0;
		for(int i=0;i<str.length;i++){
			count=0;
			for(int j=0;j<str.length;j++){
				if(str[j].equals(str[i])){
					count++;
				}
			}
			if(max < count){
				max=count;
				ans2=str[i];
			}
		}
		System.out.println(ans2+" "+ans1);
	}
}