import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int[] a=new int[101];
			while(true){
				a[sc.nextInt()]++;
				if(a[0]==2){
					break;
				}
			}
			boolean flag=true;
			for(int i=3;i<101;i++){
				if(a[i]%2!=0){
					flag=false;
					break;
				}
			}
			System.out.println(flag?"OK":"NG");
		}
	}
}