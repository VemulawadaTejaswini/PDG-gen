import java.util.*;
class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
                Arrays.sort(a);
                int i;
                for(i=0;i<a.length-1;i++){
                        System.out.print(a[i] + " ");
                }
                System.out.println(a[i]);
        }
}