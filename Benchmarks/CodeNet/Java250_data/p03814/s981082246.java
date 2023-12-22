import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int start = 0;
		int startcount = 0;
		int finish = 0;
		
		for(int i = 0;i<s.length();i++){
			
			if(s.substring(i, i+1).equals("Z")){
				finish = i;//末尾のZを切り取るので限界まで調べて更新し続ける
			}
			
			
			if(s.substring(i, i+1).equals("A")&&startcount==0){
				start = i;
				startcount = 1;//先頭のAを切り取りたいので最初に見つけたAのみでいい
			}
			
		}
		
		
		//System.out.println(s.substring(start, finish+1));
		System.out.println(s.substring(start, finish+1).length());
		
		
		
		
		
		
		
		
	}

}
