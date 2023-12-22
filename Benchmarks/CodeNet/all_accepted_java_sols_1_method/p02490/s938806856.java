import java.util.*;
public class Main {
    public static void main(String args[]){
            Scanner in =new Scanner(System.in);
            int [] ints=new int[2];
            int i;
            while(((ints[0]=in.nextInt())!=0)|((ints[1]=in.nextInt())!=0)){
                Arrays.sort(ints);
                for(i=0;i<ints.length;i++){
                    System.out.print(ints[i]);
                    if(i!=1)System.out.print(" ");
                    else System.out.println();
                }
            }   
    }
}