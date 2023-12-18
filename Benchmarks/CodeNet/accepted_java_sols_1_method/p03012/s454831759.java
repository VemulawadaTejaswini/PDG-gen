import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i=0; i<num; i++){
		  array[i] = sc.nextInt();
        }
        int sumL = 0;
        int sumR = 0;
        int min = 100;
        int sub = 0;
        int index = 0;
        for(int i=0; i<num-1; i++){
          sumL = 0;
          sumR = 0;
          for(int j=0; j<num; j++){
            if(j <= index) sumL += array[j];
            else sumR += array[j];
          }
          sub = Math.abs(sumL-sumR);
          //System.out.println(sub);
          if(sub < min) min = sub;
          index++;
        }
		System.out.println(min);
	}
}