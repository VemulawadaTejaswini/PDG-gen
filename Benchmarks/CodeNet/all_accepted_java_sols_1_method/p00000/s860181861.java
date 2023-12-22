import java.io.*;

class Main{
	public static void main(String[] a){
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.println((i+1)+"x"+(j+1)+"="+(i+1)*(j+1));
			}
		}
	}
}