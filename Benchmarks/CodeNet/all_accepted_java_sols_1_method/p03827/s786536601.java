import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String S=s.next();
		int i=0;
		int y[]=new int[S.length()];
		int max=0;
		
		for(i=0;i<S.length();i++){
			if(S.charAt(i)=='I'){
				x++;
				y[i]=x;
			}else{
				x--;
				y[i]=x;
			}
		}
		
		max=y[0];
		
		for(i=0;i<S.length();i++){
			if(max<y[i]){
				max=y[i];
			}
		}
		if(max<0){
			max=0;
		}
		System.out.println(max);

	}

}