import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double X = sc.nextDouble();
      	double i;
      	double j;
      	int count = 0;
      	for(i = 1; i <= X / 2 + 1; i++){
          for(j = 1; j <= X / 2 + 1; j++){
            if(count <= (int) Math.pow(i, j) && (int) Math.pow(i, j) <= X){
              count = (int) Math.pow(i, j);
            }
          }
        }
        System.out.println(count);  
    }
}