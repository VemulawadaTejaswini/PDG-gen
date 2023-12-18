import java.util.*;                                                                                  

public class Sorting_Three_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int[] a = { 
          Integer.parseInt(l[0]),
          Integer.parseInt(l[1]),
          Integer.parseInt(l[2])
        };  
    
        Arrays.sort(a);

        for(int i = 0; i < a.length; i++) {
          if(0 < i) {
            System.out.print(" ");
          }   
          System.out.print(a[i]);
          if(i == a.length - 1) {
            System.out.println();
          }   
        }   
    }   
}