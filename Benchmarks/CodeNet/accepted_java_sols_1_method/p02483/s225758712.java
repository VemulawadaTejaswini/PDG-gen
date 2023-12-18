import java.util.*;
public class Main{
        public static void main(String args[]){
                int [] ints =new int[3];
                int i;
                Scanner in =new Scanner(System.in);
                for(i=0;i<3;i++){
                        ints[i]=in.nextInt();
                }
                Arrays.sort(ints);
                for(i=0;i<3;i++){
                        System.out.print(ints[i]);
                        if(i!=2)System.out.print(" ");
                        else System.out.println("");

                }
        }
}