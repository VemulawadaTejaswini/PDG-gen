import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int pa=0,pb=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String A = sc.next();
			String B = sc.next();
			if(A.compareTo(B)>0){
				pa+=3;
			}else if(A.compareTo(B)<0){
				pb+=3;
			}else{
				pa++;
				pb++;
			}
		}
		System.out.println(pa+" "+pb);
	}
}