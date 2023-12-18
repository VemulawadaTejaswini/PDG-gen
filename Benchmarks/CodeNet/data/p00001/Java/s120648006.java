import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] hill=new int[10];
		int len;
		for(int i=0;i<(len=hill.length);i++) hill[i]=sc.nextInt();
		Arrays.sort(hill);
		for(int i=0;i<3;i++) System.out.println(hill[len-1-i]);
		sc.close();
	}
}