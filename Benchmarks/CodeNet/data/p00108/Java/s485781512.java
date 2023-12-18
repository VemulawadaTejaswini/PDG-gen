import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0)break;
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
            	array[i] = sc.nextInt();
            }
            int cnt = 0;
            while(true){
                int[] next = new int[n];
                int[] count = new int[999];
                for(int i : array)count[i]++;
                boolean f = true;
                for(int i = 0; i < n; i++){
                    next[i] = count[array[i]];
                    if(next[i] != array[i])f = false;
                }
                if(f){
                	System.out.println(cnt);
                	for(int i = 0; i < array.length -1; i++){
                		System.out.print(array[i] + " ");
                	}
                	System.out.println(array[array.length - 1]);
                    break;
                }
                cnt++;
                array = next;
            }
        }
    }
}
