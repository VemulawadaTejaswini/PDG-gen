import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner kb=new Scanner(System.in);
	int n=kb.nextInt();
	double hs[]=new double[n];
	int count[]=new int[6];
	for(int i=0;i<n;i++){
		hs[i]=kb.nextDouble();
	}
	for(int i=0;i<n;i++){
		if(hs[i]<165){
			count[0]++;
		}else if(hs[i]>=165&&hs[i]<170){
			count[1]++;
		}else if(hs[i]>=170&&hs[i]<175){
			count[2]++;
		}else if(hs[i]>=175&&hs[i]<180){
			count[3]++;
		}else if(hs[i]>=180&&hs[i]<185){
			count[4]++;
		}else if(hs[i]>=185){
			count[5]++;
		}
		
	}
	
	for(int i=0;i<6;i++){
		System.out.print(i+1+":");
		for(int j=0;j<count[i];j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}