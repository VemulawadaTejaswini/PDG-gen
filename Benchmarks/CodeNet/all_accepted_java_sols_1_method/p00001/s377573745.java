import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] m=new int[4];
		m[0]=sc.nextInt();
		m[1]=sc.nextInt();
		m[2]=sc.nextInt();
		int work,a;
		for(int j=1;j<=2;j++){
			for(int i=j;i>0;i--){
				if(m[i-1]<m[i]){
					m[3]=m[i-1];
					m[i-1]=m[i];
					m[i]=m[3];
				}
			}
		}
		a=3;
		while(a<10){
			int i=2;
			work=sc.nextInt();
			a++;
			while(((i>=0) && work>m[i])){
					m[i+1]=m[i];
					i--;
			}
			if(i!=2){
				m[i+1]=work;
			}
		}
		
			System.out.println(m[0]+"\n"+m[1] + "\n"+m[2]);
		

	}

}