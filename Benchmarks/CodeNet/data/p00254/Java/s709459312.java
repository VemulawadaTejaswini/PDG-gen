import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
//		new AOJ0260().doIt();
		new AOJ0259().doIt();
	}
	
	
	class AOJ0259{
		
		String solve(String input){
			int[] num = new int[4];
			for(int i=0;i<4;i++)num[i] = Integer.parseInt(input.charAt(i)+"");
			if(num[0]==num[1]&&num[0]==num[2]&&num[0]==num[3])return "NA";
			int cnt = 0;
			while(true){
				if(num[0]==6&&num[1]==1&&num[2]==7&&num[3]==4)break;
				Arrays.sort(num);//小さい
//				for(int i=0;i<num.length;i++)System.out.println(num[i]);
				int l = Integer.parseInt(Integer.toString(num[3])+Integer.toString(num[2])+
						Integer.toString(num[1])+Integer.toString(num[0]));
				int s = Integer.parseInt(Integer.toString(num[0])+Integer.toString(num[1])+
						Integer.toString(num[2])+Integer.toString(num[3]));
				String a = Integer.toString(l-s);
				if(a.length()<4)for(int i=0;i<4-a.length();i++)a = "0"+a;
				for(int i=0;i<a.length();i++)num[i] =Integer.parseInt(a.charAt(i)+"");
				cnt++;
			}
			return Integer.toString(cnt);
		}
		
		void doIt(){
			while(true){
				String input = in.next();
				if(input.equals("0000"))break;
				String solve = solve(input);
				System.out.println(solve);
			}
		}
	}
	
	class AOJ0260{
		void doIt(){
			while(true){
				int n = in.nextInt();
			}
		}
	}
	
}