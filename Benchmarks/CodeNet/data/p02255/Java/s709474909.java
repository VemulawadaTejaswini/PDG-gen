import java.util.Scanner;

public class Main {

        public static void insertSort(int arr[],int N) {
            if (arr == null || N < 2){
                System.out.println(arr[0]);
                return;
            }
            for (int i = 1; i < N; i++){
                for (int j = i-1; j >= 0 && arr[j] > arr[j+1] ; j--){
                    swap(arr,j,j+1);
                }
                printArray(arr,N);
            }
        }

        public static void swap(int arr[], int i , int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void printArray(int []arr , int N){
            System.out.print(arr[0]);
            for(int i = 1; i < N; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] arr = new int[100];
            int N = in.nextInt();
                    for (int i = 0; i < N; i++) {
                        arr[i] = in.nextInt();
                    }
                    insertSort(arr,N);
                }

            }


