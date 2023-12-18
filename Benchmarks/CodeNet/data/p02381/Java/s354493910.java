import java.util.Scanner;
//import java.lang.Math;

class Main{
	
	public static void main(String[] arg){
	Scanner sc=new Scanner(System.in);
	//総点数
		
	while(true){
		
		double sum=0.0;
        double go;
		int cnt=sc.nextInt();//件数
		double[] suji=new double[cnt];//点数
		
		if(cnt==0){
			break;
		}
	for(int i=0;i<cnt;i++){
		suji[i]=sc.nextDouble();
		sum+=suji[i];
	}
		double ave= sum/cnt;
		sum=0.0;
	for(int j=0;j<cnt;j++){
			sum+=Math.pow((suji[j]-ave),2);
			
		}
		
		
		 go=Math.sqrt(sum/cnt);
		 System.out.printf("%.8f\n",go);
		}}}
