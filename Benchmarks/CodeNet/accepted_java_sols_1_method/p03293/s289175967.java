import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ans="No";
		boolean f=false;
	//	List<String> S=new ArrayList<String>();
	//	List<String> T=new ArrayList<String>();
		
		String[] S= sc.nextLine().split("");
		String[] T =sc.nextLine().split("");
		
		for(int i=0;i<S.length;i++){
			for(int k=0;k<S.length;k++){
				int a=k+i;
				if(! (a<S.length)){
					a=k+i-S.length;
				}
				if(!((S[a].equals(T[k]))))break;
				if(k==S.length-1){
					ans="Yes";
					f=true;
					break;
				}
			}
			if(f)break;
		}
		System.out.println(ans);
	}
}
