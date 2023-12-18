import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int m = stdIn.nextInt();
			int n = stdIn.nextInt();
			if((m|n)==0){
				return;
			}
			boolean[] a = new boolean[m+1];
			a[0] = true;
			int now = 0;
			int player = m;
			for(int i=1;i<=n;i++){
				if(player==1){
					continue;
				}
				while(true){
					now++;
					if(now==m+1){
						now = 1;
					}
					if(!a[now]){
						break;
					}
				}
				String tmp = stdIn.next();
				boolean judge = false;
				if(i%3==0&&i%5==0){
					if(tmp.equals("FizzBuzz")){
						judge = true;
					}
				}
				else if(i%3==0){
					if(tmp.equals("Fizz")){
						judge = true;
					}
				}
				else if(i%5==0){
					if(tmp.equals("Buzz")){
						judge = true;
					}
				}
				else{
					int num = 0;
					try{
						num = Integer.parseInt(tmp);
					}
					catch(Exception e){
						continue;
					}
					if(num==i){
						judge = true;
					}
				}
				if(!judge){
					a[now] = true;
					player--;
				}
			}
			boolean flag = true;
			for(int i=0;i<=m;i++){
				if(!a[i]){
					if(flag){
						System.out.print(i);
						flag = false;
					}
					else{
						System.out.print(" "+i);
					}
				}
			}
			System.out.println();
		}
	}
}