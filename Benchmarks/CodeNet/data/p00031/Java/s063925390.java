import java.util.*;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		while(scan.hasNext()){
			String ans="";
			int n=scan.nextInt();
			
			for(int i=10;i>=0;--i){
				int p=(int)Math.pow(2,i);
				if(n-p>=0){
					n-=p;
					ans=p+" "+ans;
				}
			}
			ans=ans.substring(0,ans.length()-1);
			System.out.println(ans);
		}
		scan.close();
	}
}