import java.util.*;

class  Main{
	int count=0;
	String YN;
	String[] N; String mei, goi;
	Scanner sc = new Scanner(System.in);
	
	void input(){
		int n = sc.nextInt();
		N = new String[n];
		for(int i=0;i<n;i++){

			if(sc.next().equals("insert")){
				goi = sc.next();
				inSert();
			}else{
				goi = sc.next();				
				searCh();
			}
		}
	}
	void inSert(){
		N[count++] = goi;
	}
	void searCh(){
		YN="no";		
		for(int i=0; i<=count; i++){
			if(goi.equals(N[i])){
				YN="yes";
				break;
			}
		}
		System.out.println(YN);
	}

	public static void main(String[]args){
		new Main().input();
	}
}