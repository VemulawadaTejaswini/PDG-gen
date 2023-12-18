import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		int[] d;
		d= new int [10];
		int a=0,b=0,c=0;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			d[i]=sc.nextInt();
			if(d[i]>a){
				c=b;
				b=a;
				a=d[i];
			}
			else if(d[i]>b){
				c=b;
				b=d[i];
			}
			else if(d[i]>c){
				c=d[i];
			}
			
		}
		System.out.println(a+"\n"+b+"\n"+c);
	}

}