import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;


public class Main{   
	public static void main(String[] args){   
		ArrayList<Long> list = new ArrayList<Long>();

		long TMP=2;

		list.add(TMP);

		for(long i=3;i<=1000000;i++){
			boolean flag=true;
			for(long num :list){

				long tmp = (long)Math.sqrt(i);

				if(tmp<num){
					break;
				}

				if(i%num==0){
					flag=false;
					break;
				}
			}

			if(flag==true){
				list.add(i);
			}
		}

		
		//Collections.sort(list);
		Scanner scan = new Scanner(System.in);

		while(true){
			long n = scan.nextInt();
			long count=0;
			if(n==0){
				break;
			}

			for(long tmp:list){
				if(tmp>n && tmp<=2*n){
//					System.out.println(tmp);
					count++;	
				}
			}

			System.out.println(count);
		}


	}
}