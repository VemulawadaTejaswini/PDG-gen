import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w;
		int n;
		int a,b;
		short tmp;
		
		w = sc.nextInt();
		n = sc.nextInt();
		
		int[] data = new int[w];
		
		for(int i=0;i<w;i++){
			data[i] = i+1;
		}
		for(int i=0;i<n;i++){
			String[] str = sc.next().split(",");
			data = swap(data,Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		}
		sc.close();
		for(int i=0;i<w;i++){
			System.out.println(data[i]);
		}
	}
	
	static int[] swap(int[] dat,int a,int b){
		int temp;
		
		--a;
		--b;
		
		temp = dat[a];
		dat[a] = dat[b];
		dat[b] = temp;
		
		return dat;
	}
}