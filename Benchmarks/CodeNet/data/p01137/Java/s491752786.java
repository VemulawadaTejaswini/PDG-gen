import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int e=sc.nextInt();
			if(e==0) break;
			grab:{
				for(int m=1; m<=e; m++ ){//mを小さい順に見つけるまで全探索
					for(int x=0; x<=m; x++){
						for(int y=0; x+y<=m; y++){
							int z=m-x-y;
							//System.out.println(x+" "+y+" "+z);
							if(x+(y*y)+(z*z*z) == e){
//								System.out.println(x+" "+y+" "+z);
								System.out.println(m);
								break grab;
							}
						}
					}
				}
			}//grab
		}
	}
}