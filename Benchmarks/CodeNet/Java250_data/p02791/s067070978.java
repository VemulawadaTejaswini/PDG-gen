    import java.util.*;

    public class Main{
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int updatedMin = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scn.nextInt();
                if(arr[i] <min){
                    updatedMin++;
                    min = arr[i];
                }
            }
            System.out.println(updatedMin);

        }
    }