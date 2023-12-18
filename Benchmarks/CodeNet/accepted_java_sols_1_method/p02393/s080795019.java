import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
   int[] vec=new int[3];
   vec[0]=a;vec[1]=b;vec[2]=c;
   Arrays.sort(vec);
   System.out.println(vec[0]+" "+vec[1]+" "+vec[2]);
           }
}


