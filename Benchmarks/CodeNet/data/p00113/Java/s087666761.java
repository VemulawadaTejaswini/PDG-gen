import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			int a=cin.nextInt();
			int b=cin.nextInt();
			Map<Integer,Integer>map=new HashMap<Integer,Integer>();
			int cnt=-1;
			while(true){
				cnt++;
//				System.out.println(a+" "+b);
				int div=a/b;
				int mod=a%b;
				if(mod==0){
					System.out.println();
					break;
				}
				if(cnt!=0)
				System.out.print(div);
				
				if(map.containsKey(mod)){
					System.out.println();
					for(int i=0;i<map.get(mod);i++){
						System.out.print(" ");
					}
					for(int i=0;i<cnt-map.get(mod);i++){
						System.out.print("^");
					}
					System.out.println();
//					System.out.println(map.get(mod)+" "+cnt);
					break;
				}
				
				map.put(mod,cnt);
				a = mod*10;
			}
		}
	}

}