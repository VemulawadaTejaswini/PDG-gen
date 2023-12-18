import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int n=scan.nextInt();
         	for(int i=0;i<10;i++){
         		if(n%2==1){
         		System.out.print((int)Math.pow(2,i));
         		if(i!=9&&n!=1)System.out.print(" ");
         		}
         		n/=2;
         	}
         	System.out.println();
        }
    }
}