import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        	int ans=0;
        	for(int x=1;x<=(-1+(int)Math.pow(i-2, 0.5));x++){
        		for(int y=x;y<=(-x-1+(int)Math.pow(-3*x*x-2*x-3+4*i,0.5))/2;y++){
        			double z=(-x-y)+Math.pow(-3*x*x-3*y*y-2*x*y+4*i, 0.5);
        			if(z%2==0&&z>=y*2){
        				int b=(int)z/2;
        					if(x==y&&y==b){ans++;}
        					else if(x==y||y==b||b==x){ans=ans+3;}
        					else{ans=ans+6;}
        			}
        		}
        	}
        	System.out.println(""+ans);
        }
}
}