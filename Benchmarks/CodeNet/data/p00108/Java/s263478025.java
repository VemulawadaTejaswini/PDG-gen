import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        while(truez){
            int n = sc.nextInt();
            if(n == 0)break;
            array = new int[n];
            for(int i = 0; i < n; i++)array[i] = sc.nextInt();
            int cnt = 0;
            while(true){
                int[] next = new int[n];
                int[] count = new int[13];
                for(int i : array)count[i]++;
                boolean judge = true;
                for(int i = 0; i < n; i++){
                    next[i] = count[array[i]];
                    if(next[i] != array[i])judge = false;
                }
                if(judge){
                	break;
                
                }
                cnt++;
                array = next;
            }
            System.out.println(cnt);
            for(int i = 0; i < array.length -1; i++){
            	System.out.print(array[i] + " ");
            }
            System.out.println(array[array.length - 1]);
        }
    }
}
