import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> x=new ArrayList<>();
		int m = sc.nextInt();
		String s = m+"";
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
			x.add(sc.nextInt());
		
		for(int i=m;i<=100000;i++){
			
			String ss=i+"";
			boolean b=true;
			
			for(int j=0;j<ss.length();j++){
				if(x.contains(ss.charAt(j)-'0')){
					b=false;
					break;
				}
			}
			
			if(b){
				System.out.print(i);
				break;
			}
		}
	}
}
