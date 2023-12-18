import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int[] a=new int[101];
			while(a[0]<2){
				a[sc.nextInt()]++;
			}
			boolean flag=false;
			if(a[1]%2==1&&a[2]%2==1){
				flag=true;
				for(int i=3;i<101;i++){
					if(a[i]%2==1){
						flag=false;
						break;
					}
				}
			}
			System.out.println(flag?"OK":"NG");
		}
	}
}