import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int number = sc.nextInt();
    int[] array = new int[number];
		for(int i = 0; i < number; i++){
      array[i] = sc.nextInt();
    }

    Arrays.sort(array);
    int total = 0;
    for(int i = 0; i < array.length-2; i++){

        for(int j = 1+i; j < array.length-1; j++){

            for(int k = 1+j; k < array.length; k++){
              if(array[i]+array[j] <= array[k])
                break;
              total++;
            }

        }

    }

    System.out.println(total);
	}
}