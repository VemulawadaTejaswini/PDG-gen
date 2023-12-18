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
            int arraySize=Integer.parseInt(br.readLine());


            while(arraySize!=0){
                String[] arraysString =  br.readLine().split(" ");
                int[] arrays = ( Arrays.asList(arraysString).stream().mapToInt(x-> Integer.parseInt(x))).toArray();
                int colorNum=colorCount(arraySize,arrays);

                if(colorNum==-1){
                    System.out.println("NO COLOR");
                }else{
                    System.out.println(colorNum);
                }

                arraySize = Integer.parseInt(br.readLine());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static int colorCount(int arraySize,int[] arrays) {
        ArrayList<Integer> list = toList(arrays);

        Stream<Integer> uniqueList = list.parallelStream().distinct();

        Optional<Integer> color =uniqueList.filter((Integer i)-> arraySize/2 < (list.stream().filter((Integer listItem)-> listItem==i).count())).findFirst();

        if(color.isPresent()){
            return color.get();
        }else{
            return -1;
        }


    }

    public static ArrayList<Integer> toList(int[] arr){
        // int[] -> ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int t : arr) list.add(t);
        return list;
    }

}