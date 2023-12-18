import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	static Main app=new Main();
	
	void sub(int ans){
		
		System.out.println(ansdown(ans)+" "+ansup(ans));	
	}
	
	public static int ansdown(int temp){
		int ans=0;
		for(int i=2;i<temp;i++){
			boolean judge=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					judge=false;
				}
			}if(judge){
				ans=i;
			}
		}
		return ans;
	}
	public static int ansup(int temp){
		boolean finish=true;
		temp++;
		while(finish){
			boolean judge=true;
			for(int i=2;i<temp;i++){
				if(temp%i==0){
					judge=false;
				}
			}
			if(judge){
				finish=false;
			}else{
				temp++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		while(sc.hasNextInt())app.sub(sc.nextInt());
	}
}