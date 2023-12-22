import java.util.Arrays;
import java.util.Scanner;



class Main{


    public static void main(String[] a){


        Scanner sc = new Scanner(System.in);

        int j = sc.nextInt();

        for(int i = 0; i < j; i++){


        	int[] d = new int[3];


        	for(int k = 0; k < 3; k++){
	        	d[k] = sc.nextInt();
	        }

        	Arrays.sort(d);

        	if(d[2] * d[2] == d[0] * d[0] + d[1] * d[1]){
        		System.out.println("YES");
        	}else{
        		System.out.println("NO");
        	}

        }

        sc.close();

   }


}