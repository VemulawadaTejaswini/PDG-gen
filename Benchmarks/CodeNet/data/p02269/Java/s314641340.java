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
			mei = sc.next();
			goi = sc.next();
			if(mei.equals("insert")){
				inSert();
			}
			if(mei.equals("find")){
				YN="no";
				searCh();
			}
		}
	}
	void inSert(){
		N[count++] = goi;
	}
	void searCh(){
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