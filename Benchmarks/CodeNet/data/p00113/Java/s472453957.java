import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			StringBuffer ans = new StringBuffer();
			
			while(true){
				if(a%b==0){
					System.out.println(ans);
					break;
				}else if(list.indexOf(a%b)!=-1){
					System.out.println(ans);
					for(int i=0;i<ans.length();i++){
						if(i<list.indexOf(a%b)) System.out.print(" ");
						else System.out.print("^");
					}
					System.out.println();
					break;
				}else{
					list.add(a%b);
					a = a%b*10;
				}
				ans.append(a/b);
			}
		
		}
	}	
}