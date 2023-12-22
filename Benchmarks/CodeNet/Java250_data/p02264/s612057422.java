import java.util.Scanner;

class Data{
	String name;
	int time;
	Data next;
	
	Data(String s,int t){
		name=s;
		time=t;
		next=null;
	}
}

public class Main {
	static Data first=new Data("",0);
	static Data attention=first;
	
	static Data dequeue(){
		Data tmp=first.next;
		if(attention==tmp){
			attention=first;
		}
		first.next=tmp.next;
		return tmp;
	}
	
	static void enqueue(String s,int t){
		attention.next=new Data(s,t);
		attention=attention.next;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();//プロセス数。
		int q=scan.nextInt();//クォンタム
		int finish=0;
		String s;
		int t;
		for(int i=0;i<n;i++){
			s=scan.next();
			t=scan.nextInt();
			enqueue(s,t);
		}

		while(first.next!=null){
			Data tmp=dequeue();
			s=tmp.name;
			t=tmp.time;
			finish+=q;
			if(t-q<=0){//プロセスが終了する場合
				finish=finish+(t-q);
				System.out.printf("%s %d\n",s,finish);
			}else{//プロセスがまだ終了しない場合
				enqueue(s,t-q);
			}
		}
		
		
		scan.close();
		
	}

}