import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
	
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int i, j, tmp;
	int[] data={a,b,c};

	

	for(i=0; i<2; i++)
	for(j=i+1; j<3; j++)
	if(data[i] > data[j]){
	tmp=data[i];
	data[i]=data[j];
	data[j]=tmp;
	}

	for(i=0; i<3; i++) System.out.print(data[i] + " ");
	System.out.println();
	}

	
}

