import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                int arraySize=Integer.parseInt(br.readLine());
                if(arraySize<=0){
                    break;
                }

                String[] arraysString =  br.readLine().split(" ");
                int colorNum=colorCount(arraySize,toList(arraysString));

                if(colorNum==-1){
                    System.out.println("NO COLOR");
                }else{
                    System.out.println(colorNum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static int colorCount(int arraySize, ArrayList<Integer> list) {
        int[] uniqueNums = list.stream().distinct().mapToInt(x->x).toArray();

        for(int num:uniqueNums){
            long countNum= list.stream().filter((i)->i==num).count();
            if(countNum > arraySize/2){
                return num;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> toList(String[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String t : arr) list.add(Integer.parseInt(t));
        return list;
    }

}