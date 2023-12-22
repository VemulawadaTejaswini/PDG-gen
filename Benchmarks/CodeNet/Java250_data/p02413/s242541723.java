
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int r=sc.nextInt();
int c =sc.nextInt();
int [][]hy =new int[r+1][c+1];
for(int i=0; i<r; i++){
	for(int s=0; s<c; s++){
		hy[i][s]=sc.nextInt();
	}
}
for(int l=0; l<c+1; l++){
	for(int m=0; m<r+1; m++){
		if(m<r) hy[r][l] += hy[m][l];
		}
	}
for(int j=0; j<r+1; j++){
	for(int k=0; k<c+1; k++){
		if(k<c){System.out.print(hy[j][k]+" ");
		hy[j][c] += hy[j][k];
		}
		else System.out.println(hy[j][k]);
	}
}
}
}