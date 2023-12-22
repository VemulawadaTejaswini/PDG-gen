import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int [][][]ho =new int[4][3][10];
int n =sc.nextInt();
for(;n>0;n--){
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
int d =sc.nextInt();
ho[a-1][b-1][c-1] += d;
}
for(int e=0; e<4; e++){
	for(int f=0; f<3; f++){
		for(int g=0; g<10; g++){
			System.out.print(" "+ho[e][f][g]);
		if(g ==9) System.out.println();
	}
	
	}
if(e<3) System.out.println("####################");
}
}
}