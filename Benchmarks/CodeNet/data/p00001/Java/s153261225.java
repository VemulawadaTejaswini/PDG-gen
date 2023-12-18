import java.util.*;
public class Main {
     public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        int mount[] = new int[10];
        
        for(int i = 0; i <mount.length; i++)
            mount[i] = input.nextInt();
         
        Arrays.sort(mount);
        //System.out.println(Arrays.toString(mount));
        
        int max1 = mount[mount.length-1];
        int max2 = mount[mount.length-2];
        int max3 = mount[mount.length-3];
        
        //System.out.println(Arrays.toString(mount));
        //System.out.println(Arrays.sort(mount));
        /*       
        for(int i = 0; i <mount.length; i++){
            if(mount[i]>max1)
                max1=mount[i];
        }
        */
        
           System.out.println(max1);
           System.out.println(max2);
           System.out.println(max3);
      }
}

