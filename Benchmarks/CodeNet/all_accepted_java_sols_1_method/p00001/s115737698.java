import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
		int[] d = new int[10];
		Scanner sc = new Scanner(System.in);
		for(byte i=0;i<10;i++){
			d[i] = Integer.parseInt(sc.nextLine());
		}
		Arrays.sort(d);
		System.out.println(d[9]+"\n"+d[8]+"\n"+d[7]);
    }
}