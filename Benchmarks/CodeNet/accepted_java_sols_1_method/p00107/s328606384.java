import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);


        while(true){
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	int c=scan.nextInt();
        	if((a|b|c)==0)break;
        	int[] area ={a*a+b*b,a*a+c*c,c*c+b*b};
        	int n = scan.nextInt();
        	for(int i=0;i<n;i++){
        		boolean flag =false;
        		int r=scan.nextInt();
        		int d =4*r*r;
        	for(int l : area)
        		if(d>l)flag=true;
        		if(flag)System.out.println("OK");
        		else System.out.println("NA");
        	}
        }
    }
}