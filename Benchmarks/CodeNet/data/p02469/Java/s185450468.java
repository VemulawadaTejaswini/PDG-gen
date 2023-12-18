import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int[] a = new int[10];
	int[][] b = new int[10][1000];
	int[] z = new int[10];
	int n, na, i;
	int j, q;
	int kazu;
	int y;
	int kai = 1; 
	
	n = scan.nextInt();
	
	for(i=0; i<n; i++){
		a[i] = scan.nextInt();
	}
	
	for(i=0; i<n; i++){
		na = a[i];
		for(kazu=2; kazu<=a[i]; kazu++){
			if(na%kazu==0){
				b[i][z[i]] = kazu;
				z[i]++;
				na /= kazu;
				kazu--;
			}
		}
	}
	
	for(i=1; i<n; i++){
				
		y = 0;
		for(j=0; j<=z[0]; j++){
			for(q=0; q<=z[i]; q++){
				if(b[0][j]==b[i][q]){
					b[i][q] = 0;
					break;
				}
			}
		}
		for(q=0; q<=z[i]; q++){
			if(b[i][q]!=0){
				b[i][y] = b[i][q];
				y++;
			}
		}
		for(j=0; j<y; j++){
			b[0][z[0]+j] = b[i][j];
		}
		z[0] += y;
	}
	
	for(j=0; j<z[0]; j++){
		kai *= b[0][j];
	}
	
	System.out.println(kai);
}
}
