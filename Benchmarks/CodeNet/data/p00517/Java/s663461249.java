import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int N=sc.nextInt();
		int rute=0;
		int nowW=0;
		int nowH=0;
		for(int i=0;i<N;i++){
			int w=sc.nextInt();
			int h=sc.nextInt();
			if(i==0){
				nowW=w;
				nowH=h;
			}
			int movew=w-nowW;
			int moveh=h-nowH;
			while(movew!=0 || moveh!=0){
				if(movew>=1 && moveh>=1){
					movew--;
					moveh--;
					rute++;
				}
				if(movew<=-1 && moveh<=-1){
					movew++;
					moveh++;
					rute++;
				}
				if(movew>0){
					movew--;
					rute++;
				}
				if(movew<0){
					movew++;
					rute++;
				}
				if(moveh>0){
					moveh--;
					rute++;
				}
				if(moveh<0){
					moveh++;
					rute++;
				}
			}
			nowW=w;
			nowH=h;
		}
		System.out.println(rute);	
	}

}