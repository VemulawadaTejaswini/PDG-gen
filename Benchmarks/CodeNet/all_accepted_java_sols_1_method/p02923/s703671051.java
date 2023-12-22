import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt(); //2<=A<=20
	int[] H = new int[N];
  	int cnt = 0;
  	int max = 0;
  	for (int i=0;i<N;i++){
      	H[i] = sc.nextInt();
    }
/*
N <= 100000
H <= 10^9
左右一列に N 個のマスが並んでいます。
左から i 番目のマスの高さは Hi です。
あなたは好きなマスに降り立ち、右隣のマスの高さが
今居るマスの高さ以下である限り右隣のマスへ移動し続けます。
最大で何回移動できるでしょうか。
*/	
  	int k=0,j=0;
  	for(k=0;k<N-1;k++){
	  	for (j=k;j<N-1;j++){
          	
    	 	if(H[j] >= H[j+1]){
        	 	cnt++; 
       		}else{
              	if (cnt == N-1){
                  	System.out.println(cnt); 
                  	System.exit(0);
                }
				else if(max < cnt){
                  	max = cnt;
                }
              	cnt = 0;
          		break;
        	}
        }
      	if (cnt == N-1){
			System.out.println(cnt);   
			System.exit(0);
        }else if(max < cnt){
          	max = cnt;
        }
      	cnt = 0;
      
    }
  	System.out.println(max);                           
}
}