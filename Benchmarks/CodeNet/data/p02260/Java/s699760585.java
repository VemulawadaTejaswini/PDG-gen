import java.util.Scanner;

class Main{

    static int selectionSort(int[] a, int n){
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            int minj = i;
            for(int j = i; j < n; j++){
                if(a[j] < a[minj])
                    minj = j;
            }
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;    
                if(i != minj)
                count++;   
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        a[i] = Integer.parseInt(sc.next());

        int counter = selectionSort(a, n);

        for(int i = 0; i < n - 1; i++)
        System.out.print(a[i] + " ");
        System.out.println(a[n - 1]);
        System.out.println(counter);
        
    }
}
