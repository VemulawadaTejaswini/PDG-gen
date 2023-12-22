import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,k[]=new int[5],t,mx=0,j;
		for(i=0;i<5;i++){
			k[i]=s.nextInt();
		}
		for(i=0;i<5;i++){
			mx=i;
			for(j=i;j<5;j++){
				if(k[j]>k[mx]){
					mx=j;
				}
			}

			t=k[i];
			k[i]=k[mx];
			k[mx]=t;
		}
		for(i=0;i<4;i++){
			System.out.print(k[i]+" ");
		}
		System.out.println(k[4]);
	}

}