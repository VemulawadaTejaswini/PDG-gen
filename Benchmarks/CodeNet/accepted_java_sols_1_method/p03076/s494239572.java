import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      //入力
      	int a = sc.nextInt();
     	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	int e = sc.nextInt();
        int order[] = {a,b,c,d,e};
      	Integer time[] = new Integer[order.length];
      	int total = 0;
     
      	for(int i = 0; i < order.length; ++i){
        	time[i] = order[i]%10;
          	order[i] = order[i]-time[i];
        }
      	
      	for(int i = 0; i < time.length; ++i){
          int amari=0;
          	if(time[i]!=0){
          		amari = 10-time[i];
            }
          	total = total+order[i]+time[i]+amari;
        }
      	Arrays.sort(time);
      
      	if(time[0]!=0){
      		total = total - (10-time[0]);
          	 //調理時間出力
      		System.out.println(total);
         }else if(time[1]!=0){
          	total = total - (10-time[1]);
          	System.out.println(total);
         }else if(time[2]!=0){
          	total = total - (10-time[2]);
          	System.out.println(total);
         }else if(time[3]!=0){
          	total = total - (10-time[3]);
          	System.out.println(total);
         }else if(time[4]!=0){
          	total = total - (10-time[4]);
          	System.out.println(total);
         }else if(time[4]==0){
          	System.out.println(total);
        }
      
    }
}