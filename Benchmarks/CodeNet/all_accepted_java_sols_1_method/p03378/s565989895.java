import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i=1;i<=m;i++){
			a.add(sc.nextInt());
		}
		int before=0;
		int after=0;
		
		for (int i=0;i<m;i++){
			if (a.get(i)<x){
				before+=1;
			}else{
				after+=1;
			}
		}
		System.out.println(Math.min(before,after));
	}
}