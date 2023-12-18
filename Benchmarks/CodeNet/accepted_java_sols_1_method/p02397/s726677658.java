import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		while(sc.hasNextLine()){
			String[] str =sc.nextLine().split(" ");
			num[0] = Integer.parseInt(str[0]);
			num[1] = Integer.parseInt(str[1]);
			if(num[0]==0 && num[1]==0){
				break;
			}
			if(num[0]>num[1]){
				int store =num[0];
				num[0] =num[1];
				num[1] =store;
			}
			System.out.println(num[0]+" "+num[1]);
		}
	}
}