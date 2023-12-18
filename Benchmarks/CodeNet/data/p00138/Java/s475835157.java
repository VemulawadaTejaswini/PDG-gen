import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] name = new int[24];
		double[] time = new double[24];
		for(int i = 0;i < 24;i++){
			name[i] = scan.nextInt();
			time[i] = scan.nextDouble();
		}
		for(int i = 0;i < 24;i += 8){
			for(int j = i;j < i+8;j++){
				for(int k = i+7;k > j;k--){
					if(time[k-1] > time[k]){
						swap(name,time,k,k-1);
					}
				}
			}
		}
		System.out.printf("%d %.2f\n",name[0],time[0]);
		System.out.printf("%d %.2f\n",name[1],time[1]);
		System.out.printf("%d %.2f\n",name[8],time[8]);
		System.out.printf("%d %.2f\n",name[9],time[9]);
		System.out.printf("%d %.2f\n",name[16],time[16]);
		System.out.printf("%d %.2f\n",name[17],time[17]);
		int[] a = {2,10,18};
		int min = sMin(time,a);
		System.out.printf("%d %.2f\n",name[min],time[min]);
		min = sMin(time,a);
		System.out.printf("%d %.2f\n",name[min],time[min]);
	}
	
	public static void swap(int[] a,double[] b,int i,int j){
		int t = a[j];a[j] = a[i];a[i] = t;
		double tt = b[j];b[j] = b[i];b[i] = tt;
	}

	public static int sMin(double[] time,int[] a){
		int min = a[0];
		if(time[a[0]] < time[a[1]]){
			if(time[a[1]] < time[a[2]]){
				min = a[0]++;
			}else if(time[a[0]] < time[a[2]]){
				min = a[0]++;
			}else{
				min = a[2]++;
			}
		}else if(time[a[1]] < time[a[2]]){
			min = a[1]++;
		}else{
			min = a[2]++;
		}
		return min;
	}
}