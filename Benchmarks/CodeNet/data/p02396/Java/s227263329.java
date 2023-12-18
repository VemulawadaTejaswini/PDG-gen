import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x[]=new int[10000];
int y = 0;
int z =1;
for(int i=1;z!=0;i++){
	x[i]=sc.nextInt();
	y++;
	if(x[i]==0){
		z=0;
	}
	}
y=y-1;
for(int i=1;i<=y;i++){
	System.out.println("case "+i+": "+x[i]);
}
	
}
}
    