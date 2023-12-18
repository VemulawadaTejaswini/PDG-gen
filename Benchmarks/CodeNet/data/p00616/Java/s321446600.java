import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();	
			int h=sc.nextInt();
			if(n==0&&h==0)break;
			
			int box[][][]=new int[n+1][n+1][n+1];
			String surface[]=new String[h];
			int point1[]=new int[h];
			int point2[]=new int[h];
			int cnt=0;
			for(int i=0;i<h;i++){
				surface[i]=sc.next();
				point1[i]=sc.nextInt();
				point2[i]=sc.nextInt();
				if(surface[i].equals("xy")){
					for(int j=0;j<n;j++){
						box[point1[i]][point2[i]][j]+=1;
						if(box[point1[i]][point2[i]][j]==1)cnt++;
					}
				}else if(surface[i].equals("xz")){
					for(int j=0;j<n;j++){
						box[point1[i]][j][point2[i]]+=1;
						if(box[point1[i]][j][point2[i]]==1)cnt++;
					}
				}else if(surface[i].equals("yz")){
					for(int j=0;j<n;j++){
						box[j][point1[i]][point2[i]]+=1;
						if(box[j][point1[i]][point2[i]]==1)cnt++;
					}
				}
			}
//			int cnt=0;
//			for(int i=0;i<=n;i++){
//				for(int j=0;j<=n;j++){
//					for(int k=0;k<=n;k++){
//						//System.out.println(i+" "+j+" "+k+" "+box[i][j][k]);
//						if(box[i][j][k]!=0){
//							cnt++;
//							//System.out.println(i+" "+j+" "+k);
//						}
//					}	
//				}
//			}
			System.out.println(n*n*n-cnt);
		}
	}
}