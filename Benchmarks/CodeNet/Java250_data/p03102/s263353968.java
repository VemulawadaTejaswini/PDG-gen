import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int dateNum = scan.nextInt();
      	int dateFeatureNum = scan.nextInt();
      	int con = scan.nextInt();
      	int acNum = 0;	
		int[] dateFeature = new int[dateFeatureNum];
      	//B_iを配列dateFeatureに格納する
      	for(int i = 0; i < dateFeatureNum; i++){
        	dateFeature[i] = scan.nextInt();
        }
      	for(int i = 0; i < dateNum; i++){
        	int sum = 0;
            for(int j = 0; j < dateFeatureNum; j++){
            	int a = scan.nextInt();
              	sum += a*dateFeature[j];
            }
          	sum += con;
          	
          	if(sum > 0){
            	acNum++;
            }
        }
      	System.out.println(acNum);
    }
}