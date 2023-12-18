import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int[] hyo=new int[str.length];
		int max=0;
		String maxhyo="";
		String maxlength="";
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j])){
					hyo[i]++;
				}
			}
		}
		for(int i=0;i<str.length;i++){
			if(max<hyo[i]){
				max=hyo[i];
				maxhyo=str[i];
			}
		}
		max=0;
		for(int i=0;i<str.length;i++){
			if(max<str[i].length()){
				max=str[i].length();
				maxlength=str[i];
			}
		}
		System.out.println(maxhyo+" "+maxlength);
	}
}