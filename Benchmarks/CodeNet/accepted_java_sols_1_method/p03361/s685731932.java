import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		boolean flag=true;

		char s[][]=new char[h+2][w+2];

		for(int i=0;i<h+2;i++){
            for(int j=0;j<w+2;j++) s[i][j]='.';
        }

		for(int i=1;i<=h;i++){
			String str=sc.next();
			for(int j=1;j<=w;j++){
				s[i][j]=str.charAt(j-1);
			}
		} 

		int[] x={1,0,-1,0};
		int[] y={0,1,0,-1};

		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				if(s[i][j]=='#') {
					boolean ifor=false;
					for(int k=0;k<4;k++){
                        if(s[i+x[k]][j+y[k]]=='#'){
                        	ifor=true;
                        }
                    }
                    if(!ifor){
                    	flag=false;
                    }
				}
			}
		}
		if(flag) System.out.println("Yes");
		else System.out.println("No");
	}
}