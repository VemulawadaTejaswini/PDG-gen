import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==1) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			int p;
			for(int i=1;;i++){
				p = 7*i-1;
				if(p>n) break;
				if(n%p==0) list.add(p);
				p += 2;
				if(p>n) break;
				if(n%p==0) list.add(p);
			}
			
			System.out.print(n + ":");
			boolean flag;
			for(int i=0;i<list.size();i++){
				p = list.get(i);
				flag = false;
				for(int j=i-1;j>=0;j--){
					if(p%list.get(j)==0){
						flag = true;
						break;
					}
				}
				if(flag==false) System.out.print(" " + p);
			}
			System.out.println();
			
		}	
	}	
}