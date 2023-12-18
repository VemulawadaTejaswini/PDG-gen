import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean bool;
		while(sc.hasNext()){
			bool=true;
			int m=sc.nextInt();
			for(int i=0;i<10;i++){
				if(m%2==1){
					if(!bool){System.out.printf(" %d",(int)Math.pow(2,i));}
					else {
						System.out.printf("%d",(int)Math.pow(2,i));
						bool=false;
					}
				}
				m=m/2;
			}
			System.out.println();
		}		
	}
}
// by tuvshee 12.05.2012
// Weight