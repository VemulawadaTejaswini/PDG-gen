import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int[] dic=new int[6];
		
		
		for(int i=0;i<6;i++){
			dic[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		
		int q1,q2,A=-1,tmp;
		
		for(int i=0;i<n;i++){
			q1=scan.nextInt();
			q2=scan.nextInt();
			
			A=dic[2];
			
			if(q1==dic[1]){
				tmp=dic[0];
				dic[0]=dic[1];
				dic[1]=dic[5];
				dic[5]=dic[4];
				dic[4]=tmp;
			}else if(q1==dic[2]){
				tmp=dic[0];
				dic[0]=dic[2];
				dic[2]=dic[5];
				dic[5]=dic[3];
				dic[3]=tmp;
			}else if(q1==dic[3]){
				tmp=dic[0];
				dic[0]=dic[3];
				dic[3]=dic[5];
				dic[5]=dic[2];
				dic[2]=tmp;
			}else if(q1==dic[4]){
				tmp=dic[0];
				dic[0]=dic[4];
				dic[4]=dic[5];
				dic[5]=dic[1];
				dic[1]=tmp;
			}else if(q1==dic[5]){
				tmp=dic[0];
				dic[0]=dic[5];
				dic[5]=tmp;
				tmp=dic[4];
				dic[4]=dic[1];
				dic[1]=tmp;
			}
			
			if(q2==dic[1]){
				A=dic[2];
			}else if(q2==dic[2]){
				A=dic[4];
			}else if(q2==dic[3]){
				A=dic[1];
			}else if(q2==dic[4]){
				A=dic[3];
			}
			System.out.println(A);
		}
		
		
		scan.close();
	}
}