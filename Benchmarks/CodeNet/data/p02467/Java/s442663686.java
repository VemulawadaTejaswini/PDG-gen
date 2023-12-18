import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=a;
        for(int i=2;i<Math.sqrt(b)+1;i++){
            while(a%i==0){
                list.add(i);
                a/=i;
            }
        }
        System.out.print(b+": ");
        if(list.isEmpty()) System.out.print(b);
        else{
       for(int i=0;i<list.size();i++){
           if(i==list.size()-1) System.out.print(list.get(i));
           else System.out.print(list.get(i)+" ");
       }
    }
        System.out.println();
        }
    }
