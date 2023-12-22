import java.util.*;
class Main{
	static Scanner sc;
	static int up[];
	static int down[];
	static int cycle,freq,comp0,comp1;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		freq=sc.nextInt();
		up=new int[freq];
		down=new int[freq];
		for(int i=0;i<freq;i++){
			up[i]=0;
			down[i]=0;
			cycle=sc.nextInt();
			comp0=sc.nextInt();
			for(int j=0;j<cycle-1;j++){
				comp1=sc.nextInt();
				if(comp1-comp0>0 && comp1-comp0>up[i]){
					up[i]=comp1-comp0;
				}else if(comp1-comp0<0 && comp0-comp1>down[i]){
					down[i]=comp0-comp1;
				}
				comp0=comp1;
			}	
		}
		for(int i=0;i<freq;i++){
			System.out.println(up[i]+" "+down[i]);
		}
	}
}