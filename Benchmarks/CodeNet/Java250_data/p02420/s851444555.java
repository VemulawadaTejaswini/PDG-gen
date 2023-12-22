import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		while(true){
			String w = sc.nextLine();
		//break	
			if(w.equals("-")){
				break;
			}
			int m = Integer.parseInt(sc.nextLine());
			for(int i=0;i<m;i++){
				int h = Integer.parseInt(sc.nextLine());
				String store1 = w.substring(0,h);
				String store2 = w.substring(h);
				w=store2+store1;
			}
			System.out.println(w);
		}
	}
}