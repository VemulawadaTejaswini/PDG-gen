import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		Loop:
		while(true){
			int sur[][] = new int[8][8];
			int si=0,sj=0;

			for(int i=0; i<8; i++){
				str = br.readLine();
				if(str == null){
					break Loop;
				}
				for(int j=0; j<8; j++){
					if(str.charAt(j) == '1')
						sur[i][j]=1;
				}
			}


			SEARCH:
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					if(sur[i][j] == 1){
						si=i;
						sj=j;
						break SEARCH;
					}
				}
			}

			judgeA(sur, si, sj);
			judgeB(sur, si, sj);
			judgeC(sur, si, sj);
			judgeD(sur, si, sj);
			judgeE(sur, si, sj);
			judgeF(sur, si, sj);
			judgeG(sur, si, sj);

		}
	}

	static void judgeA(int c[][], int i, int j){
		try{
			if(c[i+1][j] == 1 && c[i+1][j+1] == 1){
				System.out.println("A");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeB(int c[][], int i, int j){
		try{
			if(c[i+3][j] == 1){
				System.out.println("B");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeC(int c[][], int i, int j){
		try{
			if(c[i][j+3] == 1){
				System.out.println("C");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeD(int c[][], int i, int j){
		try{
			if(c[i-1][j+2] == 1){
				System.out.println("D");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeE(int c[][], int i, int j){
		try{
			if(c[i+1][j+2] == 1){
				System.out.println("E");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeF(int c[][], int i, int j){
		try{
			if(c[i+2][j+1] == 1){
				System.out.println("F");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeG(int c[][], int i, int j){
		try{
			if(c[i][j+1] == 1 && c[i+1][j-1] == 1){
				System.out.println("G");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

}