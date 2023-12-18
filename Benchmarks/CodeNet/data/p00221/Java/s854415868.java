
import java.util.*;
public class Main {
	//1210 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if((m|n) == 0)break;
			String []data = new String[n+1];
			for(int i = 1 ; i <= n; i++){
				data[i] = sc.next();
			}
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i = 1; i <= m; i++){
				list.add(i);
			}
			
			int now = 0;
			for(int i = 1; i <= n; i++){
				String s = data[i];
				boolean flg = false;
				if(i % 3 ==0 && i % 5 == 0){
					if(s.equals("FizzBuzz")){
						
					}
					else{
						flg = true;
					}
				}
				else if(i % 3 == 0){
					if(s.equals("Fizz")){
						
					}
					else{
						flg = true;
					}
				}
				else if(i % 5 == 0){
					if(s.equals("Buzz")){
						
					}
					else{
						flg = true;
					}
				}
				else{
					if(s.equals(i + "")){
						
					}
					else{
						flg = true;
					}
				}
				if(flg){
					//System.out.println("now = " + now + " i= " + i);
					list.remove(now);
					if(list.size() == 0) break;
					now = now % list.size();
				}
				else{
					now = (now + 1) % list.size();
				}
			}
			for(int i = 0 ; i < list.size()-1; i++){
				System.out.print(list.get(i) + " ");
			}
			if(list.size() > 0){
				System.out.println(list.removeLast());
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}