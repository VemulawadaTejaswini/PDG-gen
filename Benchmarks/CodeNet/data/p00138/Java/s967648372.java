import java.util.*;
public class Main {
	public static void judge(int cnt,int[] name,double[] time,double[] time2,double[] time3,int[] name2,double[] time4){
		for(int i=0;i<4;i++){
			for(int k=0;k<8;k++){
				if(time[i]==time2[k]){
					if(i<2){
						System.out.print(name[k]);
						System.out.print(" ");
						System.out.println(time[i]);
					}
					else{
						name2[cnt]=name[k];
						time3[cnt]=time[i];
						time4[cnt]=time3[i];
						cnt+=1;
					}
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		int[] name=new int[10];
		int[] name2=new int[10];
		double[] time=new double[10];
		double[] time2=new double[10];
		double[] time3=new double[10];
		double[] time4=new double[10];
		for(int k=0;k<3;k++){
			for(int i=0;i<8;i++){
				name[i]=sc.nextInt();
				time[i]=sc.nextDouble();
				time2[i]=time[i];
			}
			Arrays.sort(time);
			judge(cnt,name,time,time2,time3,name2,time4);
		}
		Arrays.sort(time3);
		for(int i=0;i<2;i++){
			for(int k=0;k<8;k++){
				if(time3[i]==time4[k]){
						System.out.print(name2[k]);
						System.out.print(" ");
						System.out.println(time4[i]);
						break;
				}
			}
		}
	}
}