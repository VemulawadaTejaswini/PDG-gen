
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int two=0;
                int four=0;
                int j=0;
                int n=scanner.nextInt();
                for(int i=0;i<n;i++){
                        j=scanner.nextInt();
                        if(j%2==0){
                                two++;
                                if(j%4==0){
                                        four++;
                                }
                        }
                }
                two-=four;
                /*
                if(two==0){
                        if(four!=0){
                                four=four*2+1;
                        }
                }else{
                        if(four!=0){
                                four*=2;
                        }
                }
                if(two<2){
                        two=0;
                }
                if(n>two+four){
                        System.out.println("No");
                }else{
                }
                */

                if(two==0){
                        if((n-four)>four+1){
                                System.out.println("No");
                        }else{
                                System.out.println("Yes");
                        }
                }else{
                        if((n-two-four)>four){
                                System.out.println("No");
                        }else{
                                System.out.println("Yes");
                        }
                }

        }
}
