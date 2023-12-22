import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
int size=kb.nextInt();
int a[][]=new int[size][3];
int x,y,z;
for(int i=0;i<size;i++){
	a[i][0]=kb.nextInt();
	a[i][1]=kb.nextInt();
	a[i][2]=kb.nextInt();
}
for(int i=0;i<size;i++){
x=a[i][0];
y=a[i][1];
z=a[i][2];
if(x*x+y*y==z*z||y*y+z*z==x*x||z*z+x*x==y*y){
	System.out.println("YES");
}else{
	System.out.println("NO");
}
}
	}

}