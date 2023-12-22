import java.util.*;
class Main{
        public static void main(String [] args){
                Scanner in = new Scanner(System.in);
                while(in.hasNext()){
                        int a = in.nextInt();
                        int b = in.nextInt();
                        if(a==0 && b==0){
                                break;
                        }
                        for(int j=0; j<a; j++){
                                for(int k=0; k<b-1; k++){
                                System.out.print("#");
                                }
                                System.out.println("#");
                        }
                                System.out.println("");
                }
        }
}