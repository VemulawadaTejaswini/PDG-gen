import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] list = {a,b,c};
        Arrays.sort(list);
        
        for(int i = 0; i < list.length; i++){
            if(i == list.length-1){
            System.out.print(list[i]);
            }else{
             System.out.print(list[i]);
             System.out.print(" ");             
            }

        }        
    System.out.println();
    }
}
