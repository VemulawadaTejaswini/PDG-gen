package javaTest;


import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Lenovo on 2017/6/30.
 */
public class Algorithm {
    public static int top;
    public static int[] s = new int[1000];
    public static void main(String[] args){
//        int n = 7;
//        int list[] = {5,3,1,3,4,2,6};
//        int result = getMax(n,list);
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        String[] expr = scanner.nextLine().split(" ");
        for(String str : expr){
            if(str.equals("+") ||str.equals("-") || str.equals("*")){
                int temp,num1 = pop(),num2 = pop();
                switch (str){
                    case "+": temp = num1+num2;
                        break;
                    case "-": temp = num2 - num1;
                        break;
                    default:temp = num1*num2;
                        break;
                }
                push(temp);
            }else{
               push(Integer.valueOf(str));
            }
        }
        System.out.println(pop());
        
    }

    public static void push(int x){
        s[++top] = x;
    }

    public static int pop(){
        top --;
        return s[top + 1];
    }

//    private static int getMax(int n, int[] list) {
//        int max = Integer.MIN_VALUE, left = 0;
//
//        for(int i = 1; i < n; i++){
//            System.out.println(max);
//            max =  Integer.max(max, list[i] - list[left]);
//            if(list[i] < list[left])
//                left = i;
//        }
//
//        return max;
//    }
}