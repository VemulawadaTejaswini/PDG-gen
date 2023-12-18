import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input1 = new String[N];
        String[] input2 = new String[N];
        for (int i = 0; i <N;i++){
            String s = sc.next();
            input1[i] = s;
            input2[i] = s;
        }
        bubbleSort(input1,N);
        selectionSort(input2,N);
        print(input1,N);
        System.out.println("Stable");
        print(input2,N);
        System.out.println(match(input1,input2) ? "Stable" : "Not stable");


    }

    static boolean match(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals(s2[i])) {
                return false;
            }
        }
        return true;
    }
    static void bubbleSort(String[] input ,int N){
        int i,j;
        for (i = 0; input.length > i;i++ ){
            for(j=N-1;j>=i+1;j--){
                if(input[j].charAt(1) <input[j-1].charAt(1)){
                    String bigger = input[j-1];
                    input[j-1] = input[j];
                    input[j] = bigger;
                }
            }
        }
    }
    static void selectionSort(String []input ,int N){
        int i,j,minj;
        for (i=0; i <N; i++){
            minj = i;
            for (j =i; j < N; j++){
                if(input[j].charAt(1) < input[minj].charAt(1)){
                    minj = j;
                }
            }
            if(i != minj) {
                swap(i,minj,input);
            }
        }
    }
    static void swap(int a, int b, String [] input) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
    static void print(String [] input,int N) {
        int k;
        for (k = 0; k < N - 1; k++) {
            System.out.print(input[k] + " ");
        }
        if (k == N - 1) {
            System.out.println(input[k]);
        }
    }
}

