import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder a=new StringBuilder(s);
		StringBuilder b=new StringBuilder("");
		int T=sc.nextInt();
		int m=0;
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			if(n==2){
				int d=sc.nextInt();
				String c=sc.next();
				
				if(m==0){
					if(d==1){
						b=b.append(c);
					}else{
						a=a.append(c);
					}
				}else{
					if(d==1){
						a=a.append(c);
					}else{
						b=b.append(c);
					}
				}
			}else if(n==1){
				if(m==0){
					m=1;
				}else{
					m=0;
				}
			}
		}
		
		if(m==0){
			System.out.println(b.reverse()+""+a);
		}else if(m==1){
			System.out.println(a.reverse()+""+b);
		}
	}

}
