

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] k= new int[n];
		String[] line = sc.nextLine().split(" ");
		k[0]=Integer.parseInt(line[0]);
		k[1]=Integer.parseInt(line[1]);
		if(n==3){
			k[2]=Integer.parseInt(line[2]);
		}
		int answer;
		while(!(k[0]==k[1])){
			if(k[0]>k[1]){
				answer=k[0]-k[1];
				k[0]=answer;
			}else{
				answer=k[1]-k[0];
				k[1]=answer;
			}
		}
		if(n==3){
			while(!(k[0]==k[2])){
				if(k[0]>k[2]){
					answer=k[0]-k[2];
					k[0]=answer;
				}else{
					answer=k[2]-k[0];
					k[2]=answer;
				}
			}
		}
		for(int i=0;i<k[0];i++){
			if(k[0]%(i+1)==0){
				System.out.println(i+1);
			}
		}
	}
}

