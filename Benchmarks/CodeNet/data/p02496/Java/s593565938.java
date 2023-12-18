import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
			int[][] a=new int [4][13];
			int x;
			x=cin.nextInt();
				for(int i=0;i<x;i++){
				String m;
				int n,z=0;
			    m=cin.next();
			    n=cin.nextInt();
			     if(m=="S"){
			    	 z=0;
			     }
			     else if(m=="H"){
			    	 z=1;
			     }
			     else if(m=="C"){
			    	 z=2;
			     }	
			     else if(m=="D"){
			    	 z=3;
			     }
			    a[z][n-1]=1;
				}
			for(int i=0;i<4;i++){
				for(int o=0;o<13;o++){
					if(i==0){
						if(a[i][o]!=1){
							System.out.print("S ");
							System.out.println(o+1);
						}
					}
					else if(i==1){
						if(a[i][o]!=1){
							System.out.print("H ");
							System.out.println(o+1);
						}
					}
					else if(i==2){
						if(a[i][o]!=1){
							System.out.print("C ");
							System.out.println(o+1);
						}
					}
					else if(i==3){
						if(a[i][o]!=1){
							System.out.print("D ");
							System.out.println(o+1);
						}
					}
						
				}
			}
	}

}