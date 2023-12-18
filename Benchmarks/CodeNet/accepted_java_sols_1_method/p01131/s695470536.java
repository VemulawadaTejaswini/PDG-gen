import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			String s = sc.next();
			int p = 0;
			int q = 0;
			int r = 0;
			int count = 0;
			
			for(int j=0;j<s.length();j++){
				q = p;
				p = s.codePointAt(j)-48;

				if(p==0){
					if(q==1){
						if(count%5==1) r = 46;
						else if(count%5==2) r = 44;
						else if(count%5==3) r = 33;
						else if(count%5==4) r = 63;
						else r = 32;
					}else if(q==7){
						r = 112+(count-1)%4;
					}else if(q==8){
						r = 116+(count-1)%3;
					}else if(q==9){
						r = 119+(count-1)%4;
					}else{
						r = 91 + q*3 + (count-1)%3;
					}
					if(q!=0) System.out.print((char)r);
					count=0;
				}else{
					count++;
				}		
			}
			System.out.println();
		}
		
	}	
}