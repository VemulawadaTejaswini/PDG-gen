import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        	int ans=0;
        	for(int x=1;x<=(int)Math.pow(n, 0.5);x++){
        		for(int y=x;y<=(int)Math.pow(n, 0.5);y++){
        			for(int z=y;z<=(int)Math.pow(n, 0.5);z++){
        				if((x*x+y*y+z*z+x*y+y*z+z*x)==i){
        					if(x==y&&y==z){ans++;}
        					else if(x==y||y==z||z==x){ans=ans+3;}
        					else{ans=ans+6;}
        				}
        			}
        		}
        	}
        	System.out.println(""+ans);
        }
}
}