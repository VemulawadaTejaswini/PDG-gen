import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10000+1];
		int n = sc.nextInt();
		for(int i=1;i<=100;i++){
			for(int j=1;j<=100;j++){
				for(int k=1;k<=100;k++){
					if(i*i+j*j+k*k+i*j+i*k+k*j<=10000){
					arr[i*i+j*j+k*k+i*j+i*k+k*j]++;
					}
					else{
						break;
					}
				}
			}
		}
		for(int i=1;i<=n;i++){
			System.out.println(arr[i]);
		}
	}
}