import java.util.*;
class Main {
       public static void main(String[] args){
              int a[] = new int[10];
              Scanner docaoa = new Scanner(System.in);
              for (int i = 0; i < 10; i++){
                  a[i] = docaoa.nextInt();
              }
              Arrays.sort(a);
              System.out.println(a[9]);
              System.out.println(a[8]);
              System.out.println(a[7]);        
       }
}