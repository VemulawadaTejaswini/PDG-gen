package sub;

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count = 0;
		int temp=0;
		boolean judge = false;
		
			int l=sc.nextInt();
			//if(l==0)break;
			judge=false;
			for(int i=0;i<12;i++){
				int M=sc.nextInt();
				int N=sc.nextInt();
				temp+=M-N;
				//System.err.println(temp);
				count++;
				if(temp>=l){
					judge=true;
					break;
				}
			}
		if(judge)System.out.println(count);
		else System.out.println("NA");
	}
}