import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int Target = cin.nextInt();
		int result = 1;
		String temp = "equal";
		long list[] = new long[Target];

		for(int i = 0; i < Target; i++){
			list[i] = cin.nextLong();
		}

		for(int j=0; j< Target-1;j++){
			if("equal".equals(temp)){
				if(list[j]<list[j+1]){
					temp = "asc";
					continue;
				}else if(list[j]>list[j+1]){
					temp = "desc";
					continue;
				}
			}
			if("asc".equals(temp)){
				if(list[j]<=list[j+1]){
				}else{
					result += 1;
					temp = "equal";
				}
			}
			if("desc".equals(temp)){
				if(list[j]>=list[j+1]){
				}else{
					result+=1;
					temp="equal";
				}
			}

		}
		System.out.println(result);

	}
}
