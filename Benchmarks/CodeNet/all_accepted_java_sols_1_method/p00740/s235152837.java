import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] n;
		int storn;
		Scanner s = new Scanner(System.in);
		while(true){
			int x = s.nextInt();
			if(x==0) break;
			n = new int[x];
			storn = s.nextInt();
			for(int i=0;i<x;i++)
				n[i]=0;
			int k=0;
			int max=storn;
			while(true){
				if(storn==0){
					storn=n[k];
					n[k]=0;
				}else{
					n[k] += 1;
					storn -= 1;
				}
				if(n[k]==max){
					System.out.println(k);
					break;
				}
				k++;
				if(k==x) k=0;
			}

		}


	}

}