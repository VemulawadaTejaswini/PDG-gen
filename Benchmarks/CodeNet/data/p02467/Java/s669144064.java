import java.util.Scanner;
import java.util.*;

public class Main{

    public static void main(String[] args){
        int count=0;
        Map<Integer,Integer> list =new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=a;
        for(int i=2;i<Math.sqrt(b)+1;i++){
            count=0;
            while(a%i==0){
                count++;
                a/=i;
            }
            if(count!=0) list.put(i,count);
        }
        System.out.print(b+": ");
        for(int figure: list.keySet()){
            System.out.print(figure+" "+list.get(figure)+" ");
        }
        System.out.println();
        }
    }
