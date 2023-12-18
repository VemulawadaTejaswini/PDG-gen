import java.util.Scanner;

class Main{
	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		
		int t = 0,h=0;
		for(int i=0;i<m;i++){
			String taro,hana;
			taro=sc.next();
			hana=sc.next();
			//taro=taro.substring(0, 1);
			//hana=taro.substring(0, 1);
			if(taro.compareTo(hana)>0){
				t+=3;
				
			}else if(taro.compareTo(hana)<0){
				h+=3;
			}else{
				t+=1;
				h+=1;
			}
                   }
		System.out.println(t+" "+h);	
		
		
		
		
		
		
		}
}
