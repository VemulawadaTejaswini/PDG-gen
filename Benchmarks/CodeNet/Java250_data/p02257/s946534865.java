import java.util.Scanner;
import java.util.*;

public class Main{

   static boolean Sosu(int p){
        int count=0;
        if(p==1) return false;
        else if(p==2) return true;
        else {
            for (int i=2;i<Math.sqrt(p)+1;i++){
            if(p%i==0) count++;
        }
        if(count==0) return true;
        else return false;
    }
   }
    public static void main(String[] args){
        int count=0;
        ArrayList<Integer> list =new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++){
        int b =sc.nextInt();
        list.add(b);
        }
        for(int i=0;i<list.size();i++){
            if(Sosu(list.get(i))==true) count++; 
        }
        System.out.println(count);
        }
}


