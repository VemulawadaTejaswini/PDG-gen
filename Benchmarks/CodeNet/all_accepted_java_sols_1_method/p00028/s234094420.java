import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[101],i,max=0;
		while(s.hasNext()){
			a[s.nextInt()]++;
		}
		for(i=0;i<101;i++){
			if(a[i]>max) max=a[i];
		}
		for(i=0;i<101;i++){
			if(a[i]==max){
				System.out.println(i);
			}
		}
	}
}