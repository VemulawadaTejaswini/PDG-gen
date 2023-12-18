import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int[] num = new int[num1];

        for(int i = 0;i < num1;i++){
            num[i] = sc.nextInt();
        }

        for(int i = num1;i > 0;i--){
            if(i == 1)  System.out.print(num[i -1]);
            else System.out.print(num[i - 1]+" ");
        }

        System.out.println();
    }
}

