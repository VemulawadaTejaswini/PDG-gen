import java.util.Scanner;

public class Main {

	static int H,W,N;
	static int field[][];
	static boolean already[][];
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		H=cin.nextInt();
		W=cin.nextInt();
		N=cin.nextInt();
		field=new int[H][W];
		already=new boolean[H][W];
		for(int i=0;i<H;i++){
			char[] s=cin.next().toCharArray();
			for(int j=0;j<W;j++){
				if(s[j]=='.'){
					field[i][j]=0;
				}
				else{
					field[i][j]=s[j]-'A'+1;
				}
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W-1;j++){
				if(field[i][j]==field[i][j+1])continue;
				int[][] tmpF=new int[H][W];
				for(int k=0;k<H;k++){
					for(int l=0;l<W;l++){
						tmpF[k][l]=field[k][l];
					}
				}
				int tmp=field[i][j];
				field[i][j]=field[i][j+1];
				field[i][j+1]=tmp;
//				output();
				if(check()){
					System.out.println("YES");
					return ;
				}
				for(int k=0;k<H;k++){
					for(int l=0;l<W;l++){
						field[k][l]=tmpF[k][l];
					}
				}
			}
		}
		System.out.println("NO");
	}
	static boolean check(){
		if(!canDelete()){
			return false;
		}
		for(int k=0;k<H;k++){
			for(int l=0;l<W;l++){
				if(field[k][l]!=0)return false;
			}
		}
		return true;
	}
	static boolean canDelete(){
		boolean re=false;
		int cnt=0;
		while(true){
			boolean delete=false;
			boolean[][] kesu=new boolean[H][W];
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					
					int color=field[i][j];
					if(color==0)continue;
					
					
					//tate
					if(i+N-1<H){
						boolean delete1=true;;
						for(int k=1;k<N;k++){
							if(field[i+k][j]!=color){
								delete1=false;
							}
						}
						if(delete1){
							delete=true;
							re=true;
							for(int k=0;k<N;k++){
								kesu[i+k][j]=true;
							}	
						}						
					}

					if(j+N-1<W){
						//yoko
						boolean delete2=true;;
						for(int k=1;k<N;k++){
							if(field[i][j+k]!=color){
								delete2=false;
							}
						}//タ夕カ力
						if(delete2){
							delete=true;
							re=true;
							for(int k=0;k<N;k++){
								kesu[i][j+k]=true;
							}	
						}
					}
				}
			}
			if(!delete){
				break;
			}
			else{
//				output();
				for(int i=0;i<H;i++){
					for(int j=0;j<W;j++){
						if(kesu[i][j])field[i][j]=0;
					}
				}
				
				fall();
//				output();
			}
		}
		return re;
	}
	static void fall(){
		for(int i=H-1;i>=0;i--){
			for(int j=0;j<W;j++){
				while(field[i][j]==0){
					boolean aru=false;
					for(int k=i;k>=1;k--){
						if(field[k-1][j]!=0)aru=true;
						field[k][j]=field[k-1][j];
						field[k-1][j]=0;
					}
					if(!aru)break;
				}
			}
		}
	}
	static void output(){
		for(int i=0;i<H;i++){
			
			for(int j=0;j<W;j++){
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
		
}