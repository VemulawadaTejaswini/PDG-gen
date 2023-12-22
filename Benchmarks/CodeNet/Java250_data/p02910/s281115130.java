import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int flag1 = 0;
		int flag2 = 0;
		int count = 0;
		String S = sc.nextLine();
		String[] step = S.split("");
		
		for(int j=0; j<step.length; j++){
			if(j%2 == 0){
				flag1 = stepJugeB(step[j]);
				if(flag1 == 0){
					count++;
				}
			}
			else{
				flag2 = stepJugeA(step[j]);
				if(flag2 == 0){
					count++;
				}
			}
		}
		
		if(count == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static int stepJugeA(String x){
		int flag = 0;
		if(x.equals("L") || x.equals("U") || x.equals("D")){
			flag = 1;
		}
		else{
			flag = 0;
		}
		return flag;
	}
	public static int stepJugeB(String x){
		int flag = 0;
		if(x.equals("R") || x.equals("U") || x.equals("D")){
			flag = 1;
		}
		else{
			flag = 0;
		}
		return flag;
	}
}