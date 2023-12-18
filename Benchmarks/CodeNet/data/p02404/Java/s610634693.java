import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		while(true){
			int W= cin.nextInt();
			int H= cin.nextInt();
			
			if( W==0 && H==0 ){
				break;
			}
			else{
				int i,j;
				for(i=0;i<H;i++){
					if( i==0 || i==H-1 ){
						for(j=0;j<W;j++){
							System.out.print("#");
						}
					}
					else{
						for(j=0;j<W;j++){
							if( j==0 || j==W-1 ){
								System.out.print("#");
							}
							else{
								System.out.print(".");
							}
						}
					}
					System.out.print("\n");
				}
			}
			System.out.println();
		}
	}
}