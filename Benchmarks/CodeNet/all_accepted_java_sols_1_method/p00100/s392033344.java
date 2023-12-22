import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while(true){
        	int n=scan.nextInt();
        	if(n==0)break;
        	long syatiku[] =new long[4001];
        	for(int i=0;i<4001;i++)syatiku[i] = 0;
        	int []  input =new int [n];
        	for(int i=0;i<n;i++){
        		input[i] = scan.nextInt();
        		syatiku[input[i]]+=scan.nextLong()*scan.nextLong();
        	}
        	boolean flag =true;
        	for(int i=0;i<n;i++){
        		if(syatiku[input[i]]>=1000000){
        			System.out.println(input[i]);
        			syatiku[input[i]] =0;
        			flag =false;
        		}
        	}
        	if(flag)System.out.println("NA");
        }
    }
}