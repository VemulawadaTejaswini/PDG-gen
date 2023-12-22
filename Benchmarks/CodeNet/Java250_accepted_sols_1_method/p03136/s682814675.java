import java.util.Scanner;
class Main{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int sumOfLeft=0;
	int max=0;
	int side=0;
	int N=s.nextInt();
	for(int i=0;i<N;i++){
		side=s.nextInt();
		sumOfLeft+=side;
		if(max<side) max=side;
	}
	if(sumOfLeft<=(2*max)) System.out.println("No");
	else System.out.println("Yes");
}}