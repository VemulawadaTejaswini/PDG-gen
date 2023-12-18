import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);

		int w=sc.nextInt();
		int h=sc.nextInt();
		int n=sc.nextInt();
		int p1=0;//???????????±
		int p2=0;//???????????±
		int move=0;
		int cnt=0;

		for(int i=0;i<n;i++){
			move=sc.nextInt();
			if(move==0){
				p1++;
			}else if(move==1){
				p2++;
			}
			cnt+=cnt(p1,p2,w,h);
		}
		pw.println(cnt);

		sc.close();
		pw.close();
	}


	public static int cnt(int p1,int p2,int w,int h){
		if(p2<w-2){
			if(p2==p1){
				return 1;
			}else{
				return 0;
			}
		}
		if(p2==w-1){
			return 0;
		}
		if(p2>w-1&&p2<w+h-2){
			if(p2+2==p1){
				return 1;
			}else{
				return 0;
			}			
		}
		if(p2==w+h-2){
			return 0;
		}
		if(p2>w+h-2){
			if(p2+4==p1){
				return 1;
			}else{
				return 0;
			}			
		}
		return -1;
	}
}