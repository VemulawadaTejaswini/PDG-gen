import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 int count = 0;
		 int result[] = new int[100];
		 int recNum;
		 while(true){
			 int n = Integer.parseInt(bf.readLine());
			 int sum1 = 0,sum2 =0,sum3 = 0;
			 boolean th = false;
			 if(n == 0) break;
			 for(int i = 0; i < n; i++){
				 recNum = Integer.parseInt(bf.readLine());
				 if(recNum <= 0){
					 if(sum1 == 0){
						 result[count] = recNum;
					 } else {
						 if(sum3 == 0){
							 sum2 += recNum;
						 } else {
							 if(-sum2 < sum3){
								sum1 = sum1 + sum2 + sum3;
							 }
							 if(result[count] < sum1){
								 result[count] = sum1;
							 }
							 sum1 = sum3;
							 sum2 = recNum;
							 sum3 = 0;
							 th = true;
						 }
					 }
				 } else {
					 if(sum2 == 0){
						 sum1 += recNum;
					 } else {
						 sum3 += recNum;
					 }
				 }
			}
			if(th == false){
					result[count] = sum1;
				}
			if(sum3 != 0){
				 if(-sum2 < sum3){
					 result[count] = sum1 + sum2 + sum3;
				} else {
					 if(result[count] < sum3){
						 result[count] = sum3;
					}
				}
			}
			count++;
			 
		 }
		 for(int i = 0; i < count; i++){
			 System.out.println(result[i]);
		 }
	 }
 }