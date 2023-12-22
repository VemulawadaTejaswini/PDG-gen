import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		ArrayList<Integer> zero=new ArrayList<>();
		ArrayList<Integer> one=new ArrayList<>();
		boolean ch=false;
		boolean ii=false;
		if(s.charAt(0)=='1'){
			ch=false;
			ii=false;
		}else{
			ch=true;
			ii=true;
		}
		for(int i = 0; i<n; i++){
			if(s.charAt(i)=='1' && !ch){
				one.add(i);
				ch=true;
			}else if(s.charAt(i)=='0' && ch){
				zero.add(i);
				ch=false;
			}
		}
		if(zero.size()==0){
			System.out.println(s.length());
			return;
		}
		int ans=0;
		int sub=0;
		for(int i=0; i<=zero.size()-k; i++){
			if(k+i<zero.size()){
				ans=Math.max(ans,zero.get(k+i)-sub);
				if(ii){
					sub=one.get(i);
				}else{
					sub=one.get(i+1);
				}
			}else{
				ans=Math.max(ans,s.length()-sub);
			}
		}
		if(k>zero.size()){
			ans=s.length();
		}
		System.out.println(ans);
	}
}
