//Volume5-0514
import java.util.ArrayList;
import java.util.Scanner;

class Test {
	public int i,j,k,r;
	Test(int i,int j,int k,int r){
		this.i=i;
		this.j=j;
		this.k=k;
		this.r=r;
	}
}

class Main {

	private static ArrayList<Test> ar = new ArrayList<Test>();

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		while(true){

			int a=sc.nextInt(),
				b=sc.nextInt(),
				c=sc.nextInt();

			if(a==0&&b==0&&c==0){break;}

			int[] parts = new int[a+b+c+1];
			for(int i=0;i<parts.length;i++){parts[i]=2;}
			int   N     = sc.nextInt(),
			      i,j,k,r;

			while(N-- > 0){
				i=sc.nextInt();
				j=sc.nextInt();
				k=sc.nextInt();
				r=sc.nextInt();
				ar.add(new Test(i,j,k,r));
			}

			for(Test t:ar){
				if(t.r==1){
					parts[t.i]=1;
					parts[t.j]=1;
					parts[t.k]=1;
				}
			}

			for(Test t:ar){
				if(t.r==0){
					if      (parts[t.i]==2&&parts[t.j]==1&&parts[t.k]==1){parts[t.i]=0;}
					else if (parts[t.i]==1&&parts[t.j]==2&&parts[t.k]==1){parts[t.j]=0;}
					else if (parts[t.i]==1&&parts[t.j]==1&&parts[t.k]==2){parts[t.k]=0;}
				}
			}

			for(int l=1;l<parts.length;l++){
				System.out.println(parts[l]);
			}
		}
	}
}