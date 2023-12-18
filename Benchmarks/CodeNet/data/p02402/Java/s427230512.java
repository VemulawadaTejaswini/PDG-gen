import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
Scanner kb=new Scanner(System.in);
int n=kb.nextInt();
int a[]=new int[20000];
int nowMax=0,nowMin=0,sum=0;
for(int i=0;i<n;i++){
	a[i]=kb.nextInt();
}
nowMax=a[0];
nowMin=a[0];
for(int i=0;i<n;i++){
if(nowMax<a[i]){
	nowMax=a[i];
}if(nowMin>a[i]){
	nowMin=a[i];
}
sum+=a[i];
}

System.out.printf("%d %d %d\n",nowMin,nowMax,sum);
	}

}