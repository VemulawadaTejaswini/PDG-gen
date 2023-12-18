import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;


public class Main{   
	public static void main(String[] args){   
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);

		for(int i=3;i<=123456;i++){
			boolean flag=true;
			for(int num :list){

				int tmp = (int)Math.sqrt(i);

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
			int n = scan.nextInt();
			int count=0;
			if(n==0){
				break;
			}

			for(int tmp:list){
				if(tmp>n && tmp<=2*n){
//					System.out.println(tmp);
					count++;	
				}
			}

			System.out.println(count);
		}


	}
}