import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			int min = 0;
			int max = 0;
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] list = new int[4801];
			Arrays.fill(list, 0);
			for(int i = 0; i < N; i++){
				int temp = sc.nextInt();
				list[temp] += 1;
			}
//			Rating 1-399 : gray
			int count = 0;
			for(int i = 1; i< 400; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 400-799 : brown
			count = 0;
			for(int i = 400; i< 800; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 800-1199 : green
			count = 0;
			for(int i = 800; i< 1200; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 1200-1599 : cyan
			count = 0;
			for(int i = 1200; i< 1600; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 1600-1999 : blue
			count = 0;
			for(int i = 1600; i< 2000; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 2000-2399 : yellow
			count = 0;
			for(int i = 2000; i< 2400; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 2400-2799 : orange
			count = 0;
			for(int i = 2400; i< 2800; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating 2800-3199 : red
			count = 0;
			for(int i = 2800; i< 3200; i++){
				count+=list[i];
			}
			if(count > 0){
				min++;
				max++;
			}
//			Rating over 3200
			count = 0;
			for(int i = 3200; i< 4801; i++){
				count+=list[i];
			}
			max = min+count;
			min = (min == 0)? 1 : min;
			System.out.println(min + " " + max);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}