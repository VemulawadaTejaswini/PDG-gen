package PriorityQue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int[] que;
	private static int count;
	public static void main(String[] args)throws IOException{
		que = new int[1000000];
		count =0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] str=br.readLine().split(" ");
			if(str[0].equals("end")) break;
			else if(str[0].equals("extract")) extract();
			else if(str[0].equals("insert")){
				int n=Integer.parseInt(str[1]);
				insert(n);
			}
		}
	}
	
	private static void extract(){
		System.out.println(" "+que[1]);
		for(int i=2;i<=count;i++) que[i-1]=que[i];
		count--;
	}
	
	private static void insert(int n){
		count++;
		que[count]=n;
		bubble();
	}
	
	private static void bubble(){
        for(int i = 1 ; i < count ; i++){
            for(int j = count;j>i;j--){
                if(que[j]>que[j-1]){
                    int temp=que[j];
                    que[j]=que[j-1];
                    que[j-1]=temp;
                }
            }
        }
    }
	
}