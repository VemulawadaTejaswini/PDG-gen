import java.util.Scanner;
class Main {
	int n,i,x,y,z,b,f,r,v;
	int[][][] count = new int[5][4][11];
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 0;i < n;i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			count[b][f][r] += v;
		}
		for(x = 1;x <= 4;x++){
			for(y = 1;y < 4;y++){
				for(z = 1;z < 11;z++){
					System.out.print(" " + count[x][y][z]);
				}
				System.out.println();
			}
			if(x < 4){
				System.out.println("####################");
			}
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}