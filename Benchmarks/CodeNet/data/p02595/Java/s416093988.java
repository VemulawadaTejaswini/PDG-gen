import java.util.Scanner;

public class al2020707 {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int n=scanner.nextInt();
    double d=scanner.nextDouble();
	Integer[][] m=new Integer[n][2];
	int t=0;


	for(int j=0;j<n;j++) {
      for(int i=0;i<2;i++)
		int a=scanner.nextInt();
		m[j][i]=a;
	}

       for(int k=0;k<n;k++){
       int f=(m[k][0]*m[k][0])+(m[k][1]*m[k][1]);
        double s=Math.sqrt(f)
          if(s<=d){
          t=t+1;
          }
       }

	System.out.println(t);


	 }
}