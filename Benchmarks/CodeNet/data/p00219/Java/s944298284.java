import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int ice[]=new int[10];
			for(int i=0;i<n;i++){
				int s=sc.nextInt();
				if(s==0)ice[0]+=1;
				else if(s==1)ice[1]+=1;
				else if(s==2)ice[2]+=1;
				else if(s==3)ice[3]+=1;
				else if(s==4)ice[4]+=1;
				else if(s==5)ice[5]+=1;
				else if(s==6)ice[6]+=1;
				else if(s==7)ice[7]+=1;
				else if(s==8)ice[8]+=1;
				else if(s==9)ice[9]+=1;
			}
			for(int i=0;i<10;i++){
				for(int j=0;j<ice[i];j++){
					if(j==ice[i]-1)System.out.print('*'+"\n");
					else System.out.print('*');
				}
				if(ice[i]==0)System.out.println('-');
			}
		}
	}
}