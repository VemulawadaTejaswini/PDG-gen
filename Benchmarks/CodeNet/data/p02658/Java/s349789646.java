import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] LVstr = new String[N];
		Long ans = (long) 1;
		Long limit = (long) Math.pow(10,18);
      	boolean flag = false;
      
      	for(int i=0; i<N; i++){
			LVstr[i] = sc.next();
          	if(LVstr[i].equals("0")){
             	System.out.println("0");
				return;
            }
		}

		for(int i=0; i<N; i++){
			try{
				Long tmp = Long.valueOf(LVstr[i]);
				if(flag){
					continue;
				}
				ans *= tmp;
				if(ans>limit){
					flag = true;
				}
			}catch(Exception e){
				System.out.println("-1");
				return;
			}
		}
		if(flag){
			System.out.println("-1");
			return;
		}
		System.out.println(ans);
		return;
	}
}