import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float x[]=new float[n];
        float sum=0;
        for(int i=0; i<n; i++){
          x[i]=sc.nextFloat();
          sum+=x[i];
        }
        float p=Math.round(sum/n);
        float hp[]=new float[n];
        float ans=0;
        for(int j=0; j<n; j++){
          hp[j]=(x[j]-p)*(x[j]-p);
          ans+=hp[j];
        }
        //double d=fl.doubleValue(ans);
        //int s=fl.intValue(d);
        System.out.print(Math.round(ans));
        sc.close();
    }
}
