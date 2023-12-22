import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long[] num = new long[4];
      	for(int i=0;i<4;i++){
          num[i] = sc.nextLong();
        }
      	long max = num[0] * num[2];
      	for(int i=0;i<2;i++){
          for(int j=2;j<4;j++){
            if( num[i] * num[j] > max ){
              max = num[i] * num[j];
            }
          }
        }
      	System.out.println(max);
      
	}
}