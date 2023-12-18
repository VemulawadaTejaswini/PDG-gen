import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			String or= sc.next();
			if(or.equals("print")){
				int a=sc.nextInt();
				int b=sc.nextInt();
				for(int j=a;j<=b;j++){
					System.out.print(str.charAt(j));
				}
				System.out.println();
			}else if(or.equals("reverse")){
				int a=sc.nextInt();
				int b=sc.nextInt();
				String rev = str.substring(a,b+1);
				StringBuffer revsb=new StringBuffer(rev);
				revsb.reverse();
				String ver=revsb.toString();
				str=str.replace(rev,ver);
			}else{
				int a=sc.nextInt();
				int b=sc.nextInt();
				String r=sc.next();
				String rep = str.substring(a,b+1);
				str=str.replace(rep,r);
			}
		}
	}
	
}