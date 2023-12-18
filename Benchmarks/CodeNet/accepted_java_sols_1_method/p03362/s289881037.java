import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] pri=new int[300000];
		int[] pri_true=new int[300000];
		int k=0;

		for(int i=1;i<300000;i++){
            pri[i] = i;
        }
        for(int i=2;i<300000;i++){
            for(int j=i+i;j<300000;j+=i){
                pri[j]=0;
            }
        }

		for(int i=2;i<300000;i++){
			//素数をpri_trueに格納
			if(pri[i]!=0 && pri[i]%10==1){
				pri_true[k]=pri[i];
				k++;
			}
		}

		for(int i=0;i<n;i++){
        	System.out.print(pri_true[i]+" ");
        }

        System.out.println();

	}
}