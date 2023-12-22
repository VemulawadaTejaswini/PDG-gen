import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

int H  = sc.nextInt();
int W  = sc.nextInt();
int cnt=0;
int s[][] = new int [H+2][W+2];
for(int i=1; i<=H; i++){
		String HW=sc.next();
		for(int j=1; j<=W;j++){
				if(HW.charAt(j-1)=='.'){
				s[i][j]=0;
			}else{
				s[i][j]=1;
			}
		}
}
for(int i=1; i<=H; i++){
		for(int j=1; j<=W;j++){
				if(s[i][j]==1 && s[i-1][j]!=1 && s[i+1][j]!=1 && s[i][j-1]!=1 && s[i][j+1]!=1){
					cnt=cnt+1;
					break;
				}
		}
}
if(cnt>0){
	System.out.println("No");
}else{
	System.out.println("Yes");
}

}
}
