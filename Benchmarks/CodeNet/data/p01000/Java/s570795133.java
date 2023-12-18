import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int casecount = 1;
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int[][][] box = new int[7][7][7];
			int born[] = new int[27];
			int death[] = new int[27];
			for (int i=0;i<5;i++) {
				for (int j=0;j<5;j++) {
					String line = sc.next();
					for (int k=0;k<5;k++) {
						box[i+1][j+1][k+1] = Integer.parseInt(line.substring(k,k+1));
					}
				}
			}
			int m1 = sc.nextInt();
			for (int i=0;i<m1;i++) {
				born[sc.nextInt()] = 1;
			}
			int m2 = sc.nextInt();
			for (int i=0;i<m2;i++) {
				death[sc.nextInt()] = 1;
			}
			for (int i=0;i<n;i++) {
				int[][][] count = new int[7][7][7];
				for(int x=1;x<=5;x++) {
					for(int y=1;y<=5;y++) {
						for(int z=1;z<=5;z++) {
							for(int dx=-1;dx<=1;dx++) {
								for(int dy=-1;dy<=1;dy++) {
									for(int dz=-1;dz<=1;dz++) {
										if (dx!=0 || dy!=0 || dz!=0) {
											count[x+dx][y+dy][z+dz]+=box[x][y][z];
										}
									}
								}
							}
						}
					}
				}
				for(int x=1;x<=5;x++) {
					for(int y=1;y<=5;y++) {
						for(int z=1;z<=5;z++) {
							if(born[count[x][y][z]]==1) {
								box[x][y][z] = 1;
							}
							if(death[count[x][y][z]]==1) {
								box[x][y][z] = 0;
							}
						}
					}
				}
			}

			System.out.println("Case "+casecount+":");
			for(int x=1;x<=5;x++) {
				for(int y=1;y<=5;y++) {
					for(int z=1;z<=5;z++) {
						System.out.print(box[x][y][z]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			casecount++;
		}
	}
}