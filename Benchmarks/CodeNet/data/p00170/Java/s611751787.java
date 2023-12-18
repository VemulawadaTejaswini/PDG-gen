import java.util.Arrays;
import java.util.Scanner;

class Food implements Comparable<Food>{
	String f;
	int w;
	int s;
	Food(String f,int w,int s){
		this.f=f;
		this.w=w;
		this.s=s;
	}
	@Override
	//あえて逆順。いわゆる重い順。
	public int compareTo(Food o) {
		// TODO 自動生成されたメソッド・スタブ
		if(this.w<w){
			return 1;
		}
		else if(this.w>w){
			return -1;
		}
		else{
			return 0;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		new Main().run();
		//new AOJ0170().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;

			int sum=0;
			Food food[]=new Food[n];
			for(int i=0;i<n;i++){
				food[i]=new Food(sc.next(), sc.nextInt(), sc.nextInt());
				sum+=food[i].w;
			}
			int max=-1;
			
			for(int j=0;j<n;j++){
				int k=j;
				max=-1;
				for(int i=j;i<n;i++){
					if((sum-food[i].w<=food[i].s) && (max<food[i].w)){
						max=food[i].w;
						k=i;
					}
				}
				//change
				sum-=food[k].w;
				Food temp=food[j];
				food[j]=food[k];
				food[k]=temp;
			}
			Arrays.sort(food);
			for(int i=0;i<n;i++){
				System.out.println(food[i].f);
			}
		}
	}
}