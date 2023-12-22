
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(br.readLine());
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		shou(a,b,c);
	}
	static void shou(int...is ){int tmp=0;
		int l=is.length;
		for(int i=0;i<l-1;i++){
			for(int n=i+1;n<l;n++){
				if(is[i]>is[n]){
					tmp=is[i];
					is[i]=is[n];
					is[n]=tmp;
				}
			}
			}System.out.println(is[0]+" "+is[1]+" "+is[2]);
		}}
	