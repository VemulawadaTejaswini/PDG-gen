import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		int A[][][] = new int[4][3][10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String[] array = br.readLine().split(" ");
            int b = Integer.parseInt(array[0])-1;
            int f = Integer.parseInt(array[1])-1;
            int r = Integer.parseInt(array[2])-1;
            int v = Integer.parseInt(array[3]);
            A[b][f][r]+=v;
        }
        for(int i=0;i<4;i++){
        	for(int j=0;j<3;j++){
        		for(int k=0;k<10;k++){
        			System.out.print(" "+A[i][j][k]);
        		}
        		System.out.println("");
        	}
        	if(i<3) System.out.println("####################");
        }
	}
}