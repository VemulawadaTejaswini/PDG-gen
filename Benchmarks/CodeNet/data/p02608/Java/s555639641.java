import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a =  new int[n+1];
		int ans = 0;
      
      //6なら
      //1,2,
		for(int i=1;Math.pow(i,2)<n+1;i++){
          for(int j=1;Math.pow(j,2)<n+1-Math.pow(i,2);j++){
            for(int k=1;Math.pow(k,2)<n+1-Math.pow(i+j,2)+i*j;k++){
              //System.out.println(i+":"+j+":"+k);
              if( i*i + j*j + k*k + i*j + j*k + k*i < n+1 ){
              	//System.out.println(i*i + j*j + k*k + i*j + j*k + k*i);
                //System.out.println(i+":"+j+":"+k);
                a[i*i + j*j + k*k + i*j + j*k + k*i]++;
              }
            }
          }
		}
      	for(int i=1;i<n+1;i++){
          System.out.println(a[i]);
        }
	}
}