import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] list = new int[N];
        for (int i = 0 ; i < N ; i++) {
        	list[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int max = 0;
        int count = 0 ;
        for (int i = 0; i< N-1; i++) {
        	if (list[i] >= list[i+1]) {
        		count++;
        	}
        	else {count = 0;
        		}
        	
      		if (max < count) {
    			max = count;
      		}

        }
        System.out.println(max);



    }
}
