import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int Menu[] = new int[5];
        int min = 9; 
        int last = 0; 
        int i = 0;
        int count = 0; 
		// 数の入力
		for(i = 0;i < 5;i++){
          Menu[i] = sc.nextInt();
          if(Menu[i] % 10 <= min && Menu[i] % 10 != 0 ){
            min = Menu[i] % 10;
            last = i;
          }
        }
      	for(i = 0;i < 5;i++){
          if(i != last){
            if(Menu[i] % 10 == 0){
              count += Menu[i]; 
            }else{
              count += (Menu[i] / 10 + 1) * 10;
            }
          }
        }
		count += Menu[last];
    System.out.println(count);            
    }
}