import java.util.*;
class Main{
	public static void main(String[] a){
		StringBuilder buf = new StringBuilder();
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				buf.append(String.format("%dx%d=%d\n",i,j,i*j));
			}
		}
		System.out.printf(buf.toString());
	}
}