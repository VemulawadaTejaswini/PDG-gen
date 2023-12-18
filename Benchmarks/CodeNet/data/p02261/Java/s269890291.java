import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    static void checkArrayString(String[] a){
        int i ;
        for( i = 0; i < a.length -1; i++){
                System.out.print(a[i] +" ");
        }
        System.out.print(a[i]);
        System.out.println();
    }
    static String[] makeArray(int num){
        String[] arr = new String[num];
        for( int i = 0; i < num; i++){
            arr[i] = sc.next();
        }
        return arr;
    } 
    static int[] copyArrInt(int[] a){
        int[] arr = new int[a.length];
        for( int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        return arr;
    }
    static String[] copyArrString(String[] a){
        String[] arr = new String[a.length];
        for( int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        return arr;
    }
    static int minOf(int[] a, int start) {
        int index = start;
        int min = a[start];
        for(int i = start; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
    static void swap(int[] a,int i, int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;    
    }
    static void swapString(String[] a,int i, int j ){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;    
    }
    static void bubbleSort(int[] a, String[] s) {
        boolean flag = true; 
        for(int j = 0; flag; j++ ){
            flag = false;
            for(int i = a.length-1; i >= j+1 ; i--) {
                if(a[i] < a[i-1]) {
                    swap(a, i, i-1);
                    swapString(s,i,i-1);
                    flag = true;
                    
                }
            }
        }
    }
    static void selectionSort(int[] a, String[] s) {
        int index;
        for(int i = 0; i < a.length; i++) {
            index = minOf(a,i);
            if(a[index] != a[i]) {
                swap(a,i,index);
                swapString(s,i,index);
            }
        }
    }
    static String merge(String s, int i) {
        String str = s + Integer.toString(i);
        return str;
    }
    static boolean isStable(String[] a, String[] b) {
        boolean flag = true;
        for(int i = 0; flag && i < a.length ; i++) {
            if(a[i].equals(b[i])) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        String[] arr = makeArray(N);
        
        //????????¨??°??????????§£??????
        String[] suit = new String[N];
        int[] value = new int[N];
        for(int i = 0; i < arr.length; i++) {
            suit[i] = arr[i].substring(0, 1);
            value[i] = Integer.parseInt(arr[i].substring(1, 2));
        }
        
        //?????????????????¨?????????
        String[] suitTemp = copyArrString(suit);
        int[] valueTemp = copyArrInt(value);
        
        //??????????????????
        bubbleSort(value,suit);
        
        //????????¨??°??????????????????
        String[] resultbubble = new String[N];
        for(int i = 0; i < N; i++) {
            resultbubble[i] = merge(suit[i],value[i]);
        }
        checkArrayString(resultbubble);
        System.out.println("Stable");

        //???????????????
        selectionSort(valueTemp,suitTemp);
        String[] resultselection = new String[N];
        for(int i = 0; i < N; i++) {
            resultselection[i] = merge(suitTemp[i],valueTemp[i]);
        }
        checkArrayString(resultselection);
        if(isStable(resultbubble,resultselection)){
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }

    }
    
}