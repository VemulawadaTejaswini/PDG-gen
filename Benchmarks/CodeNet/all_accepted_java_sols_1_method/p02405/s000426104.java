import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i =0;
int[][] a = new int[300][2];
while (true) {
int H = sc.nextInt();
int W= sc.nextInt();
if (H == 0 && W == 0) {
break; }
a[i][0]=H;
a[i++][1]=W;
}
for (int k=0;k<i;k++){
	for (int l=0;l<a[k][0];l++){
		if (l%2==0){
	for (int j=0;j<a[k][1];j++){
		if(j%2==0){
		System.out.print("#");
	} else{
		System.out.print(".");
	}
}} else {
	for (int j=0;j<a[k][1];j++){
		if(j%2==0){
		System.out.print(".");
	} else{
		System.out.print("#");
	}
	}}
 System.out.print("\n");}
System.out.print("\n");}
sc.close();
	}
 }
