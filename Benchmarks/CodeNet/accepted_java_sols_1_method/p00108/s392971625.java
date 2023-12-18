import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	static Scanner sc;
	static int num;
	static int[] b_array,c_array,t_array;
	static int tmp,count_1,count_2;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		new Main();
	}
	Main(){
		while(true){
			num = sc.nextInt();
			if(num==0)
				return;
			b_array = new int[num];//before
			c_array = new int[num];//current
			t_array = new int[num];//tmp
			count_1=0;
			for(int i=0; i<num; i++){
				b_array[i] = sc.nextInt();
			}
			while(!Arrays.equals(c_array, b_array)){
				if(Arrays.equals(t_array, b_array)){
					for(int i=0; i<num; i++)
						b_array[i]=c_array[i];
				}
				for(int i=0; i<num; i++){
					tmp = b_array[i];
					count_2=0;
					for(int j=0; j<num; j++){
						if(tmp==b_array[j])
							count_2++;
					}
					c_array[i]=count_2;
				}
				if(!Arrays.equals(c_array, b_array)){
					for(int i=0; i<num; i++)
						t_array[i]=b_array[i];
					count_1++;
				}
			}
			System.out.println(count_1);
			for(int i=0; i<num-1; i++){
				System.out.print(c_array[i]+" ");
			}
			System.out.println(c_array[num-1]);
		}
	}
}