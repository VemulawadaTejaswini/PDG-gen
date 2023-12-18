import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					Solve obj = new Solve(a[i], a[j], a[k]);
					if(obj.solve())
						count++;
				}
			}
		}
		out.println(count);
	}
}

class Solve{
	int a, b, c;

	public Solve(int x, int y, int z){
		this.a=x;
		this.b=y;
		this.c=z;
	}

	public boolean solve(){
		if(this.a > this.b){
			int temp = this.a;
			this.a = this.b;
			this.b = temp;
		}

		if(this.a > this.c){
			int temp = this.a;
			this.a = this.c;
			this.c = temp;
		}

		if(this.b > this.c){
			int temp = this.b;
			this.b = this.c;
			this.c = temp;
		}

		return this.a != this.b && this.b != this.c && this.a + this.b > this.c;
	}
}
