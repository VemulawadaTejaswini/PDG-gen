import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{

	int ans=0;
	int max;
	int ansNum=0;

	Main(){
		Scanner scan = new Scanner(System.in);	
		while(true){
			int up =scan.nextInt();
			int down = scan.nextInt();
			if(up==0&&down==0){
				break;
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<up+down;i++){
				list.add(scan.nextInt());	
			}
				
			Collections.sort(list);

			int p=0,max=0;
			for(int i :list){
				if(i-p>max){
					max=i-p;
					int a=i-p;
				//	System.out.println("p-i:"+p+"-"+i+"="+a);
				}
				p=i;
			}
			System.out.println(max);
			list.clear();
		}
	}

	public static void main(String[] args){
		Main a = new Main();
	}


}