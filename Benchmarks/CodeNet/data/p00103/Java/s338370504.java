import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	 int n = sc.nextInt(),count,out,hit;
	 String x;
		
	 	for(int i = 0; i < n; i++){
	 		count = out = hit = 0;
	 		for(;;){
	 			x = sc.next();
	 			if(x.equals("OUT")){
	 				out++;
	 				if(hit == 4)hit = 3;
	 				if(out == 3)break;
	 			}
	 			else if(x.equals("HIT")){
	 				if(hit <= 3)hit++;
	 				if(hit == 4)count++;
	 			}else if(x.equals("HOMERUN")){
	 				count += hit + 1;
	 				hit = 0;
	 			}
	 		}
	 		System.out.println(count);
	 	}
		sc.close();
	}
}