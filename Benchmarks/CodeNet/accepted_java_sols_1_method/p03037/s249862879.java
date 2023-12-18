import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int max=1;
int min=n;
int l;
int r;
for(int i=1;i<=m;i++){
	l=sc.nextInt();
	r=sc.nextInt();
	if(l>max){max=l;}
	if(r<min){min=r;}
}
int ans=min-max+1;
if(ans>=0){
	System.out.println(ans);
}else{
	System.out.println(0);
}
	}}