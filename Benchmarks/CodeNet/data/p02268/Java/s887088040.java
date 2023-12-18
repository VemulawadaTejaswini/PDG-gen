import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] line = sc.nextLine().split(" ");
        int[] data =new int[n];
        for(int i=0; i < n; i++){
            data[i] = Integer.parseInt(line[i]);
        }

        int q = Integer.parseInt(sc.nextLine());
        String[] line2 = sc.nextLine().split(" ");
        int[] searcher = new int[q];
        for(int i=0; i < q; i++){
            searcher[i] = Integer.parseInt(line2[i]);
        }

        
        int result = 0;
        for(int search : searcher){
            int left = 0;
            int right = n;
            int mid;
            while(left < right){
                mid = (left + right) / 2;
                if(search == data[mid]){
                    result++;
                    break;
                }else if(search < data[mid]){
                    right = mid;
                }else if(search > data[mid]){
                    left = mid + 1;
                }
            }
        }
        System.out.println(result);
        



    }
    static void bubble(int[] arr, int n){

    }
    static void selection(int[] arr, int n){

    }
    static void insertionSort(int[] arr, int n, int g,int count){
        for(int i = g; i < n; i++){
            int v = arr[i];
            int j = i - g;
            while(j >= 0 && arr[j] > arr[i]){
                arr[i] = arr[j];
                j-=g;
                count++;
            }
            arr[j + g] = v;
        }
    }
    static void shellsort(int[] arr, int n){

        for(int i = 1; ; ){
            if(i > n){
                break;
            }

            i = (i * 3) + 1;
        }
    }
}
class Struct{
    String name;
    int time;
    public Struct(String n, int t){
        name = n;
        time = t;
    }
}