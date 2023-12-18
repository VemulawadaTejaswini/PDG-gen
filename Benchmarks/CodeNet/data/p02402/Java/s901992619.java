import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
Scanner kb=new Scanner(System.in);
int n=kb.nextInt();
int a[]=new int[20000];
int nowMax=0,nowMin=0;
double sum=0;
for(int i=0;i<n;i++){
if(kb.hasNextInt()){
	a[i]=kb.nextInt();
}else{
	break;
}

}
nowMax=a[0];
nowMin=a[0];
for(int i=0;i<n;i++){
if(nowMax<a[i]){
	nowMax=a[i];
}if(nowMin>a[i]){
	nowMin=a[i];
}
System.out.println(a[i]);
sum+=(double)a[i];
}

System.out.printf("%d %d %f\n",nowMin,nowMax,sum);
	}

}